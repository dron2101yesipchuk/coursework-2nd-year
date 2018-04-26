package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.Ingredients;
import com.yesipchuk.demo.model.Medicine;
import com.yesipchuk.demo.model.MedicineHasIngredients;
import com.yesipchuk.demo.service.medicineHasIngredients.impls.MedicineHasIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicineHasIngredientsController {
    @Autowired
    MedicineHasIngredientsService medicineHasIngredientsService;

    @RequestMapping("/medicine/has_ingredients")
    public List<MedicineHasIngredients> showMedicineHasIngredients() throws SQLException {
        return medicineHasIngredientsService.getAll();
    }

    @RequestMapping("/medicine/has_ingredients/del")
    public MedicineHasIngredients deleteMedicineHasIngredients(@RequestParam int id) throws SQLException{
        return medicineHasIngredientsService.deleteMedicineHasIngredients(id);
    }

    @RequestMapping("/medicine/has_ingredients/add")
    public MedicineHasIngredients addMedicineHasIngredients(@RequestParam int id, int med_id,
                                                            int ingredients_id, int ingredientsAmount) throws SQLException{
        MedicineHasIngredients medicineHasIngredients = new MedicineHasIngredients(
                id,
                new Medicine(med_id, null, null,
                        null, null, null, null, null),
                new Ingredients(ingredients_id, null, null, null, null),
                ingredientsAmount
        );

        return medicineHasIngredientsService.addMedicineHasIngredients(medicineHasIngredients);
    }

    @RequestMapping("/medicine/has_ingredients/upd")
    public MedicineHasIngredients updateMedicineHasIngredients(@RequestParam int id, int med_id,
                                                            int ingredients_id, int ingredientsAmount) throws SQLException{
        MedicineHasIngredients medicineHasIngredients = new MedicineHasIngredients(
                id,
                new Medicine(med_id, null, null,
                        null, null, null, null, null),
                new Ingredients(ingredients_id, null, null, null, null),
                ingredientsAmount
        );

        return medicineHasIngredientsService.updateMedicineHasIngredients(medicineHasIngredients);
    }
}
