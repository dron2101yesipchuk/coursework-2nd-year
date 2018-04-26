package com.yesipchuk.demo.service.ingredients.impls;

import com.yesipchuk.demo.DAO.ingredients.impls.IngredientsDAOFakeImpl;
import com.yesipchuk.demo.model.Ingredients;
import com.yesipchuk.demo.service.ingredients.interfaces.IIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class IngredientsService implements IIngredientsService{

    @Autowired
    IngredientsDAOFakeImpl ingredientsDAO;

    @Override
    public List<Ingredients> getAll() throws SQLException {
        return ingredientsDAO.getAll();
    }

    @Override
    public Ingredients deleteIngredients(int id) throws SQLException {
        return ingredientsDAO.deleteIngredients(id);
    }

    @Override
    public Ingredients addIngredients(Ingredients ingredients) throws SQLException {
        return ingredientsDAO.addIngredients(ingredients);
    }

    @Override
    public Ingredients updateIngredients(Ingredients ingredients) throws SQLException {
        return ingredientsDAO.updateIngredients(ingredients);
    }
}
