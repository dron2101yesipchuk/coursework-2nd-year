package com.yesipchuk.demo.DAO.generalTypeOfMedicine.impls;

import com.yesipchuk.demo.DAO.generalTypeOfMedicine.interfaces.IGeneralTypeOfMedicineDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class GeneralTypeOfMedicineDAOFakeImpl implements IGeneralTypeOfMedicineDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<GeneralTypeOfMedicine> getAll() throws SQLException {
        List<GeneralTypeOfMedicine> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM general_type_of_medicine");
        while(resultSet.next()){
            list.add(new GeneralTypeOfMedicine(resultSet.getInt("id"),
                    resultSet.getString("name_of_general_type")));
        }
        return list;
    }
}
