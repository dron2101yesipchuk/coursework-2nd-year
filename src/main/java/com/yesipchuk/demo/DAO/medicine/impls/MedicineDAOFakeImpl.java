package com.yesipchuk.demo.DAO.medicine.impls;

import com.yesipchuk.demo.DAO.medicine.interfaces.IMedicineDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MedicineDAOFakeImpl implements IMedicineDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<Medicine> getAll() throws SQLException {
        List<Medicine> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM medicine");
        while(resultSet.next()){
            list.add(new Medicine((long)resultSet.getInt("id"),
                    resultSet.getString("name_of_medicine"),
                    (long)resultSet.getInt("type_of_medicine_id"),
                    (long)resultSet.getInt("critical_rate"),
                    (long)resultSet.getInt("amount"),
                    resultSet.getDouble("price"),
                    resultSet.getDate("manufacture_date"),
                    (long)resultSet.getInt("expiration_term")));
        }
        return list;
    }
}
