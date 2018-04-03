package com.yesipchuk.demo.DAO.medicineHasIngredients.impls;

import com.yesipchuk.demo.DAO.medicineHasIngredients.interfaces.IMedicinesHasIngredientsDao;
import com.yesipchuk.demo.datastorage.DataStorageFake;
import com.yesipchuk.demo.model.MedicineHasIngredients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicineHasIngredientsDAOFakeImpl implements IMedicinesHasIngredientsDao {
    @Autowired
    DataStorageFake dataStorage;


    @Override
    public List<MedicineHasIngredients> getAll() {
        return dataStorage.getMedicineHasIngredients();
    }
}
