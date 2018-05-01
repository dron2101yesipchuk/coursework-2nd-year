package com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.impls;

import com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.interfaces.IDatesOfOrderingAndReceivingDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;
import com.yesipchuk.demo.model.OrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DatesOfOrderingAndReceivingDAOFakeImpl implements IDatesOfOrderingAndReceivingDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<DatesOfOrderingAndReceiving> getAll() throws SQLException {
        List<DatesOfOrderingAndReceiving> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.dates_of_ordering_and_receiving\n" +
                "JOIN order_status ON order_status.id " +
                "= dates_of_ordering_and_receiving.order_status_id\n" +
                "order by dates_of_ordering_and_receiving.id");
        while(resultSet.next()){
            list.add(new DatesOfOrderingAndReceiving(resultSet.getInt("dates_of_ordering_and_receiving.id"),
                    resultSet.getDate("dates_of_ordering_and_receiving.date_of_ordering"),
                    resultSet.getDate("dates_of_ordering_and_receiving.date_of_receiving"),
                    new OrderStatus(resultSet.getInt("order_status.id"),
                            resultSet.getString("order_status.name_of_status"))));
        }
        return list;
    }

    @Override
    public DatesOfOrderingAndReceiving deleteDate(int id) throws SQLException {
        List<DatesOfOrderingAndReceiving> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.dates_of_ordering_and_receiving\n" +
                "JOIN order_status ON order_status.id " +
                "= dates_of_ordering_and_receiving.order_status_id" +
                " where dates_of_ordering_and_receiving.id = " + id +
                " order by dates_of_ordering_and_receiving.id;");
        while (resultSet.next()){
            list.add(new DatesOfOrderingAndReceiving(
                    resultSet.getInt("dates_of_ordering_and_receiving.id"),
                    resultSet.getDate("dates_of_ordering_and_receiving.date_of_ordering"),
                    resultSet.getDate("dates_of_ordering_and_receiving.date_of_receiving"),
                    new OrderStatus(resultSet.getInt("order_status.id"),
                            resultSet.getString("order_status.name_of_status"))
            ));
        }
        String sql = "DELETE FROM dates_of_ordering_and_receiving WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public DatesOfOrderingAndReceiving addDate(DatesOfOrderingAndReceiving dates) throws SQLException {
        String sql = "INSERT INTO dates_of_ordering_and_receiving (id, date_of_ordering, date_of_receiving, order_status_id) VALUES (?,?,?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, dates.getId());
        statement.setDate(2, dates.getDateOfOrdering());
        statement.setDate(3, dates.getDateOfReceiving());
        statement.setInt(4, dates.getOrderStatus().getId());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return dates;
        else
            return null;
    }

    @Override
    public DatesOfOrderingAndReceiving updateDate(DatesOfOrderingAndReceiving dates) throws SQLException {
        String sql  ="UPDATE dates_of_ordering_and_receiving " +
                "SET dates_of_ordering_and_receiving.date_of_ordering = ?, " +
                "dates_of_ordering_and_receiving.date_of_receiving = ?, " +
                "dates_of_ordering_and_receiving.order_status_id = ? " +
                "WHERE dates_of_ordering_and_receiving.id = ?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setDate(1,dates.getDateOfOrdering());
        statement.setDate(2,dates.getDateOfReceiving());
        statement.setInt(3,dates.getOrderStatus().getId());
        statement.setInt(4, dates.getId());

        int rowsUpdated  = statement.executeUpdate();
        statement.close();
        if (rowsUpdated >0)
            return dates;
        else
            return null;
    }
}
