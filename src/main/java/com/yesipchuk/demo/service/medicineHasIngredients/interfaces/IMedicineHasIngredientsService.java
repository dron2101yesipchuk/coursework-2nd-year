package com.yesipchuk.demo.service.medicineHasIngredients.interfaces;

import com.yesipchuk.demo.modelJDBC.MedicineHasIngredients;

import java.sql.SQLException;
import java.util.List;

public interface IMedicineHasIngredientsService {
    public List<MedicineHasIngredients> getAll() throws SQLException;
}
