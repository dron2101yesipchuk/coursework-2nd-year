package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.modelJDBC.Ingredients;
import com.yesipchuk.demo.service.ingredients.impls.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientsController {
    @Autowired
    IngredientsService ingredientsService;

    @RequestMapping("/ingredients")
    public List<Ingredients> showIngredients() throws SQLException {
        return ingredientsService.getAll();
    }
}
