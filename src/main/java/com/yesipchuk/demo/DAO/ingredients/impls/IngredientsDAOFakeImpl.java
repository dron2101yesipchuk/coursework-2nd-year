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

    @Override
    public Ingredients addIngredients(Ingredients ingredients) throws SQLException {
        String sql = "INSERT INTO ingredients (id, name, critical_rate, amount, price) VALUES (?,?,?,?,?)";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setInt(1, ingredients.getId());
        statement.setString(2, ingredients.getName());
        statement.setInt(3,ingredients.getCriticalRate());
        statement.setInt(4,ingredients.getAmount());
        statement.setDouble(5,ingredients.getPrice());
        int rowsInserted = statement.executeUpdate();
        statement.close();
        if (rowsInserted>0)
            return ingredients;
        else
            return null;
    }

    @Override
    public Ingredients updateIngredients(Ingredients ingredients) throws SQLException {
        String sql  ="UPDATE ingredients " +
                "SET ingredients.name = ?, " +
                " ingredients.critical_rate = ?, " +
                " ingredients.amount = ?, " +
                " ingredients.price = ? " +
                "WHERE ingredients.id = ?";
        PreparedStatement statement = dataStorage.getCon().prepareStatement(sql);
        statement.setString(1,ingredients.getName());
        statement.setInt(2,ingredients.getCriticalRate());
        statement.setInt(3,ingredients.getAmount());
        statement.setDouble(4,ingredients.getPrice());
        statement.setInt(5, ingredients.getId());

        int rowsUpdated  = statement.executeUpdate();
        statement.close();
        if (rowsUpdated >0)
            return ingredients;
        else
            return null;
    }
}
