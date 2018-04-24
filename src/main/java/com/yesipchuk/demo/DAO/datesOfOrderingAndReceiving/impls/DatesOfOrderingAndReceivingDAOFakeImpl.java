package com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.impls;

import com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.interfaces.IDatesOfOrderingAndReceivingDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.DatesOfOrderingAndReceiving;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        resultSet = dataStorage.executeQuery("SELECT * FROM dates_of_ordering_and_receiving");
        while(resultSet.next()){
            list.add(new DatesOfOrderingAndReceiving((long)resultSet.getInt("id"),
                    resultSet.getDate("date_of_ordering"),
                    resultSet.getDate("date_of_receiving"),
                    (long)resultSet.getInt("order_status_id")));
        }
        return list;
    }
}
