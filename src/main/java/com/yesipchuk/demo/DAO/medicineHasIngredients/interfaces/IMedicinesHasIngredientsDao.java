package com.yesipchuk.demo.DAO.medicineHasIngredients.interfaces;

import com.yesipchuk.demo.model.MedicineHasIngredients;

import java.sql.SQLException;
import java.util.List;

public interface IMedicinesHasIngredientsDao {
    public List<MedicineHasIngredients> getAll() throws SQLException;
    public MedicineHasIngredients deleteMedicineHasIngredients(int id) throws SQLException;
    public MedicineHasIngredients addMedicineHasIngredients(
            MedicineHasIngredients medicineHasIngredients) throws SQLException;
    public MedicineHasIngredients updateMedicineHasIngredients(
            MedicineHasIngredients medicineHasIngredients) throws SQLException;
}
