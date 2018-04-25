package com.yesipchuk.demo.DAO.ingredients.impls;

import com.yesipchuk.demo.DAO.ingredients.interfaces.IIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.model.Ingredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class IngredientsDAOFakeImpl implements IIngredientsDao {
    @Autowired
    DataStorageJDBC dataStorage;


    @Override
    public List<Ingredients> getAll() throws SQLException {
        List<Ingredients> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM ingredients");
        while(resultSet.next()){
            list.add(new Ingredients(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("critical_rate"),
                    resultSet.getInt("amount"),
                    resultSet.getDouble("price")));
        }
        return list;
    }

    @Override
    public Ingredients deleteIngredients(int id) throws SQLException {
        List<Ingredients> list = new ArrayList<>();
        ResultSet resultSet;
        resultSet = dataStorage.executeQuery("SELECT * FROM ingredients where id="+id);
        while (resultSet.next()){
            list.add(new Ingredients(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("critical_rate"),
                    resultSet.getInt("amount"),
                    resultSet.getDouble("price")));
        }
        String sql = "DELETE FROM ingredients WHERE id=?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, id);
        int rowsDeleted = statement.executeUpdate();

        return list.get(0);
    }
}
