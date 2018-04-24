package com.yesipchuk.demo.DAO.orderStatus.impls;

import com.yesipchuk.demo.DAO.orderStatus.interfaces.IOrderStatusDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
            list.add(new OrderStatus((long)resultSet.getInt("id"),
                    resultSet.getString("name_of_status")));
        }
        return list;
    }
}
