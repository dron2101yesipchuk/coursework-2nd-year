package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.MedicineHasIngredients;
import com.yesipchuk.demo.service.medicineHasIngredients.impls.MedicineHasIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicineHasIngredientsController {
    @Autowired
    MedicineHasIngredientsService medicineHasIngredientsService;

    @RequestMapping("/medicine/has_ingredients")
    public List<MedicineHasIngredients> showBuyers(){
        return medicineHasIngredientsService.getAll();
    }
}
