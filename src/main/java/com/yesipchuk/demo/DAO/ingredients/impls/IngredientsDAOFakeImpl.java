package com.yesipchuk.demo.DAO.ingredients.impls;

import com.yesipchuk.demo.DAO.ingredients.interfaces.IIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageJDBC;
import com.yesipchuk.demo.modelJDBC.Ingredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
            list.add(new Ingredients((long)resultSet.getInt("id"),
                    resultSet.getString("name"),
                    (long)resultSet.getInt("critical_rate"),
                    (long)resultSet.getInt("amount"),
                    resultSet.getDouble("price")));
        }
        return list;
    }
}
