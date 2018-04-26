package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.Ingredients;
import com.yesipchuk.demo.service.ingredients.impls.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/ingredients/del")
    public Ingredients deleteIngredients(@RequestParam int id) throws SQLException {
        return ingredientsService.deleteIngredients(id);
    }

    @RequestMapping("/ingredients/add")
    public Ingredients addIngredients(@RequestParam int id, String name, int criticalRate,
                                      int amount, double price) throws SQLException {
        Ingredients ingredients = new Ingredients(id, name, criticalRate, amount, price);
        return ingredientsService.addIngredients(ingredients);
    }

    @RequestMapping("/ingredients/upd")
    public Ingredients updateIngredients(@RequestParam int id, String name, int criticalRate,
                                      int amount, double price) throws SQLException {
        Ingredients ingredients = new Ingredients(id, name, criticalRate, amount, price);
        return ingredientsService.updateIngredients(ingredients);
    }


}
