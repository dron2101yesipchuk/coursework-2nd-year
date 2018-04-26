package com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.impls;

import com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.interfaces.ITypeOfMedicineHasTypeOfUsingDao;
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
public class TypeOfMedicineHasTypeOfUsingDAOFakeImpl implements ITypeOfMedicineHasTypeOfUsingDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfMedicineHasTypeOfUsing> getAll() throws SQLException {
        List<TypeOfMedicineHasTypeOfUsing> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_medicine_has_type_of_using\n" +
                "JOIN type_of_medicine ON type_of_medicine.id " +
                "= type_of_medicine_has_type_of_using.type_of_medicine_id\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id " +
                "= type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id " +
                "= type_of_medicine.type_of_production_id\n" +
                "JOIN type_of_using ON type_of_using.id " +
                "= type_of_medicine_has_type_of_using.type_of_using_id;");
        while(resultSet.next()){
            list.add(new TypeOfMedicineHasTypeOfUsing(
                        resultSet.getInt("id"),
                        new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                            resultSet.getString("type_of_medicine.name_of_type"),
                            new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                                resultSet.getString("general_type_of_medicine.name_of_general_type")),
                            new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                            resultSet.getString("type_of_production.type_of_production"))),
                        new TypeOfUsing(resultSet.getInt("type_of_using.id"),
                                resultSet.getString("type_of_using.type_of_using"))));
        }
        return list;
    }

    @Override
    public TypeOfMedicineHasTypeOfUsing deleteTypeOfMedicinesHasTypeOfUsing(int id) throws SQLException {
        List<TypeOfMedicineHasTypeOfUsing> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_medicine_has_type_of_using\n" +
                "JOIN type_of_medicine ON type_of_medicine.id" +
                "= type_of_medicine_has_type_of_using.type_of_medicine_id\n" +
                "JOIN general_type_of_medicine ON general_type_of_medicine.id " +
                "= type_of_medicine.general_type_of_medicine_id\n" +
                "JOIN type_of_production ON type_of_production.id " +
                "= type_of_medicine.type_of_production_id\n" +
                "JOIN type_of_using ON type_of_using.id " +
                "= type_of_medicine_has_type_of_using.type_of_using_id\n" +
                " where type_of_medicine_has_type_of_using.id = " + id + " order by " +
                "type_of_medicine_has_type_of_using.id");
        while (resultSet.next()){
            list.add(new TypeOfMedicineHasTypeOfUsing(
                    resultSet.getInt("id"),
                    new TypeOfMedicine(resultSet.getInt("type_of_medicine.id"),
                            resultSet.getString("type_of_medicine.name_of_type"),
                            new GeneralTypeOfMedicine(resultSet.getInt("general_type_of_medicine.id"),
                                    resultSet.getString("general_type_of_medicine.name_of_general_type")),
                            new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                                    resultSet.getString("type_of_production.type_of_production"))),
                    new TypeOfUsing(resultSet.getInt("type_of_using.id"),
                            resultSet.getString("type_of_using.type_of_using"))));
        }
        String sql = "DELETE FROM type_of_medicine_has_type_of_using WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public TypeOfMedicineHasTypeOfUsing addTypeOfMedicinesHasTypeOfUsing(TypeOfMedicineHasTypeOfUsing typeOfMedicineHasTypeOfUsing) throws SQLException {
        return null;
    }

    @Override
    public TypeOfMedicineHasTypeOfUsing updateTypeOfMedicinesHasTypeOfUsing(TypeOfMedicineHasTypeOfUsing typeOfMedicineHasTypeOfUsing) throws SQLException {
        return null;
    }
}
