package com.yesipchuk.demo.DAO.medicineHasIngredients.impls;

import com.yesipchuk.demo.DAO.medicineHasIngredients.interfaces.IMedicinesHasIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.MedicineHasIngredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class MedicineHasIngredientsDAOFakeImpl implements IMedicinesHasIngredientsDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<MedicineHasIngredients> getAll() throws SQLException {
        List<MedicineHasIngredients> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM medicine_has_ingredients");
        while(resultSet.next()){
            list.add(new MedicineHasIngredients((long)resultSet.getInt("medicine_id"),
                    (long)resultSet.getInt("ingredients_id"),
                    (long)resultSet.getInt("amount_of_ingredients")));
        }
        return list;
    }
}
