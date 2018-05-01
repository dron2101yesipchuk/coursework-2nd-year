package com.yesipchuk.demo.DAO.typeOfProduction.impls;

import com.yesipchuk.demo.DAO.typeOfProduction.interfaces.ITypeOfProductionDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.TypeOfProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TypeOfProductionDAOFakeImpl implements ITypeOfProductionDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<TypeOfProduction> getAll() throws SQLException {
        List<TypeOfProduction> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_production");
        while(resultSet.next()){
            list.add(new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                    resultSet.getString("type_of_production.type_of_production")));
        }
        return list;
    }

    @Override
    public TypeOfProduction deleteTypeOfProduction(int id) throws SQLException {
        List<TypeOfProduction> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM type_of_production where id="+id);
        while (resultSet.next()){
            list.add(new TypeOfProduction(resultSet.getInt("type_of_production.id"),
                    resultSet.getString("type_of_production.type_of_production")));
        }
        String sql = "DELETE FROM type_of_production WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }

    @Override
    public TypeOfProduction addTypeOfProduction(TypeOfProduction typeOfProduction) throws SQLException {
        String sql = "INSERT INTO type_of_production (id, type_of_production) VALUES (?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, typeOfProduction.getId());
        statement.setString(2, typeOfProduction.getNameOfType());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return typeOfProduction;
        else
            return null;
    }

    @Override
    public TypeOfProduction updateTypeOfProduction(TypeOfProduction typeOfProduction) throws SQLException {
        String sql  ="UPDATE type_of_production " +
                "SET type_of_production.type_of_production = ? " +
                "WHERE type_of_production.id = ?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setString(1,typeOfProduction.getNameOfType());
        statement.setInt(2, typeOfProduction.getId());

        int rowsUpdated  = statement.executeUpdate();
        statement.close();
        if (rowsUpdated >0)
            return typeOfProduction;
        else
            return null;
    }
}
