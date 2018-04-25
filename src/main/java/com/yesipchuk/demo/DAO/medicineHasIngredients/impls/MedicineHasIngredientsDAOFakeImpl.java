package com.yesipchuk.demo.DAO.medicineHasIngredients.impls;

import com.yesipchuk.demo.DAO.medicineHasIngredients.interfaces.IMedicinesHasIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.*;
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
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.medicine_has_ingredients\n" +
                "JOIN medicine ON medicine.id = medicine_has_ingredients.medicine_id\n" +
                "JOIN ingredients ON ingredients.id = medicine_has_ingredients.ingredients_id\n" +
                "JOIN type_of_medicine ON type_of_medicine.id = medicine.type_of_medicine_id\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id = type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id = type_of_medicine.type_of_production_id;");
        while(resultSet.next()){
            list.add(new MedicineHasIngredients(
                    new Medicine(resultSet.getInt("medicine.id"),
                            resultSet.getString("medicine.name_of_medicine"),
                            new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                                    resultSet.getString("type_of_medicine.name_of_type"),
                                    new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                                            resultSet.getString("general_type_of_medicine.name_of_general_type")),
                                    new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                                            resultSet.getString("type_of_production.type_of_production"))),
                            resultSet.getInt("medicine.critical_rate"),
                            resultSet.getInt("medicine.amount"),
                            resultSet.getDouble("medicine.price"),
                            resultSet.getDate("medicine.manufacture_date"),
                            resultSet.getInt("medicine.expiration_term")),
                    new Ingredients(resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("critical_rate"),
                            resultSet.getInt("amount"),
                            resultSet.getDouble("price")),
                    resultSet.getInt("medicine_has_ingredients.amount_of_ingredients")));
        }
        return list;
    }
}
