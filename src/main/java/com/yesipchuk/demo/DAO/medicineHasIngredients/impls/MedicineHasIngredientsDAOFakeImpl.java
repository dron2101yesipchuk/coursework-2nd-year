package com.yesipchuk.demo.DAO.medicineHasIngredients.impls;

import com.yesipchuk.demo.DAO.medicineHasIngredients.interfaces.IMedicinesHasIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
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
                "JOIN type_of_production ON type_of_production.id = type_of_medicine.type_of_production_id" +
                "\n order by medicine_has_ingredients.id;");
        while(resultSet.next()){
            list.add(new MedicineHasIngredients(
                    resultSet.getInt("medicine_has_ingredients.id"),
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
                    new Ingredients(resultSet.getInt("ingredients.id"),
                            resultSet.getString("ingredients.name"),
                            resultSet.getInt("ingredients.critical_rate"),
                            resultSet.getInt("ingredients.amount"),
                            resultSet.getDouble("ingredients.price")),
                    resultSet.getInt("medicine_has_ingredients.amount_of_ingredients")));
        }
        return list;
    }

    @Override
    public MedicineHasIngredients deleteMedicineHasIngredients(int id) throws SQLException {
        List<MedicineHasIngredients> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.medicine_has_ingredients\n" +
                "JOIN medicine ON medicine.id = medicine_has_ingredients.medicine_id\n" +
                "JOIN ingredients ON ingredients.id = medicine_has_ingredients.ingredients_id\n" +
                "JOIN type_of_medicine ON type_of_medicine.id = medicine.type_of_medicine_id\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id = type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id = type_of_medicine.type_of_production_id\n" +
                " where medicine_has_ingredients.id = " + id +
                "\n order by medicine_has_ingredients.id;");
        while (resultSet.next()){
            list.add(new MedicineHasIngredients(
                    resultSet.getInt("medicine_has_ingredients.id"),
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
                    new Ingredients(resultSet.getInt("ingredients.id"),
                            resultSet.getString("ingredients.name"),
                            resultSet.getInt("ingredients.critical_rate"),
                            resultSet.getInt("ingredients.amount"),
                            resultSet.getDouble("ingredients.price")),
                    resultSet.getInt("medicine_has_ingredients.amount_of_ingredients")));
        }
        String sql = "DELETE FROM medicine_has_ingredients WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public MedicineHasIngredients addMedicineHasIngredients(MedicineHasIngredients medicineHasIngredients) throws SQLException {
        String sql = "INSERT INTO medicine_has_ingredients (id, medicine_id, ingredients_id, amount_of_ingredients) VALUES (?,?,?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, medicineHasIngredients.getId());
        statement.setInt(2, medicineHasIngredients.getMedicine().getId());
        statement.setInt(3, medicineHasIngredients.getIngredients().getId());
        statement.setInt(4, medicineHasIngredients.getAmountOfIngredients());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return medicineHasIngredients;
        else
            return null;
    }

    @Override
    public MedicineHasIngredients updateMedicineHasIngredients(MedicineHasIngredients medicineHasIngredients) throws SQLException {
        String sql  ="UPDATE medicine_has_ingredients " +
                "SET medicine_has_ingredients.medicine_id = ?, " +
                "medicine_has_ingredients.ingredients_id = ?, " +
                "medicine_has_ingredients.amount_of_ingredients = ? " +
                "WHERE medicine_has_ingredients.id = ?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1,medicineHasIngredients.getMedicine().getId());
        statement.setInt(2,medicineHasIngredients.getIngredients().getId());
        statement.setInt(3, medicineHasIngredients.getAmountOfIngredients());
        statement.setInt(4, medicineHasIngredients.getId());

        int rowsUpdated  = statement.executeUpdate();
        statement.close();
        if (rowsUpdated >0)
            return medicineHasIngredients;
        else
            return null;
    }
}
