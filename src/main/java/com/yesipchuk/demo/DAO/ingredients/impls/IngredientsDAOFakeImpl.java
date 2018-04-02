package com.yesipchuk.demo.DAO.ingredients.impls;

import com.yesipchuk.demo.DAO.ingredients.interfaces.IIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.Ingredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IngredientsDAOFakeImpl implements IIngredientsDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<Ingredients> getAll() {
        return dataStorage.getIngredients();
    }
}
