package com.yesipchuk.demo.DAO.typeOfMedicine.impls;

import com.yesipchuk.demo.DAO.typeOfMedicine.interfaces.ITypeOfMedicinesDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.model.TypeOfProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
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
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.type_of_medicine \n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id = type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id = type_of_medicine.type_of_production_id;");
        while(resultSet.next()){
            list.add(new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                    resultSet.getString("type_of_medicine.name_of_type"),
                    new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                            resultSet.getString("general_type_of_medicine.name_of_general_type")),
                    new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                            resultSet.getString("type_of_production.type_of_production"))));
        }
        return list;
    }

    @Override
    public TypeOfMedicine deleteTypeOfMedicine(int id) throws SQLException {
        List<TypeOfMedicine> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM drugstore.type_of_medicine\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id " +
                "= type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id = type_of_medicine.type_of_production_id" +
                " where type_of_medicine.id= " + id + " order by type_of_medicine.id");
        while (resultSet.next()){
            list.add(new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                    resultSet.getString("type_of_medicine.name_of_type"),
                    new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                            resultSet.getString("general_type_of_medicine.name_of_general_type")),
                    new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                            resultSet.getString("type_of_production.type_of_production"))));
        }
        String sql = "DELETE FROM type_of_medicine WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public TypeOfMedicine addTypeOfMedicine(TypeOfMedicine typeOfMedicine) throws SQLException {
        String sql = "INSERT INTO type_of_medicine (id, name_of_type, general_type_of_medicine_id, type_of_production_id) VALUES (?,?,?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, typeOfMedicine.getId());
        statement.setString(2, typeOfMedicine.getNameOfType());
        statement.setInt(3, typeOfMedicine.getGeneralType().getId());
        statement.setInt(4, typeOfMedicine.getTypeOfProduction().getId());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return typeOfMedicine;
        else
            return null;
    }

    @Override
    public TypeOfMedicine updateTypeOfMedicine(TypeOfMedicine typeOfMedicine) throws SQLException {
        return null;
    }
}
