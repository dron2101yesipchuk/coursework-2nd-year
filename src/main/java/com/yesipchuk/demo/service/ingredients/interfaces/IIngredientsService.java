package com.yesipchuk.demo.service.ingredients.interfaces;

import com.yesipchuk.demo.model.Ingredients;

import java.sql.SQLException;
import java.util.List;

public interface IIngredientsService {
    public List<Ingredients> getAll() throws SQLException;
    public Ingredients deleteIngredients(int id) throws SQLException;
    public Ingredients addIngredients(Ingredients ingredients) throws SQLException;
    public Ingredients updateIngredients(Ingredients ingredients) throws SQLException;
}
