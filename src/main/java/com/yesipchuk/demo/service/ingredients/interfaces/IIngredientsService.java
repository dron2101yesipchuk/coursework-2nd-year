package com.yesipchuk.demo.service.ingredients.interfaces;

import com.yesipchuk.demo.modelJDBC.Ingredients;

import java.sql.SQLException;
import java.util.List;

public interface IIngredientsService {
    public List<Ingredients> getAll() throws SQLException;
}
