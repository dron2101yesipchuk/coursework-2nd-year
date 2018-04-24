package com.yesipchuk.demo.DAO.typeOfMedicine.impls;

import com.yesipchuk.demo.DAO.typeOfMedicine.interfaces.ITypeOfMedicinesDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.TypeOfMedicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfMedicineDAOFakeImpl implements ITypeOfMedicinesDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfMedicine> getAll() throws SQLException {
        List<TypeOfMedicine> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_medicine");
        while(resultSet.next()){
            list.add(new TypeOfMedicine((long)resultSet.getInt("id"),
                    resultSet.getString("name_of_type"),
                    (long)resultSet.getInt("general_type_of_medicine_id"),
                    (long)resultSet.getInt("type_of_production_id")));
        }
        return list;
    }
}
