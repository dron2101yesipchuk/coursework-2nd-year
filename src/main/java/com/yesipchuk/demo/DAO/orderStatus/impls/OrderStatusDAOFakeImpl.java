package com.yesipchuk.demo.DAO.orderStatus.impls;

import com.yesipchuk.demo.DAO.orderStatus.interfaces.IOrderStatusDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrderStatusDAOFakeImpl implements IOrderStatusDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<OrderStatus> getAll() throws SQLException {
        List<OrderStatus> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM order_status");
        while(resultSet.next()){
            list.add(new OrderStatus(resultSet.getInt("id"),
                    resultSet.getString("name_of_status")));
        }
        return list;
    }

    @Override
    public OrderStatus deleteOrderStatus(int id) throws SQLException {
        List<OrderStatus> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM order_status where id="+id);
        while (resultSet.next()){
            list.add(new OrderStatus(resultSet.getInt("id"),
                    resultSet.getString("name_of_status")));
        }
        String sql = "DELETE FROM order_status WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public OrderStatus addOrderStatus(OrderStatus orderStatus) throws SQLException {
        String sql = "INSERT INTO order_status (id, name_of_status) VALUES (?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, orderStatus.getId());
        statement.setString(2, orderStatus.getNameOfStatus());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return orderStatus;
        else
            return null;
    }

    @Override
    public OrderStatus updateOrderStatus(OrderStatus orderStatus) throws SQLException {
        return null;
    }
}
