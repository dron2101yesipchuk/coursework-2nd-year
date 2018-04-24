package com.yesipchuk.demo.DAO.ingredients.interfaces;

import com.yesipchuk.demo.modelJDBC.Ingredients;

import java.sql.SQLException;
import java.util.List;

public interface IIngredientsDao {
    public List<Ingredients> getAll() throws SQLException;
}
