package com.yesipchuk.demo.DAO.medicineHasIngredients.interfaces;

import com.yesipchuk.demo.modelJDBC.MedicineHasIngredients;

import java.sql.SQLException;
import java.util.List;

public interface IMedicinesHasIngredientsDao {
    public List<MedicineHasIngredients> getAll() throws SQLException;
}
