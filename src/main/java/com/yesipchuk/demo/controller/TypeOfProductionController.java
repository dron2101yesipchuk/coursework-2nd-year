package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.TypeOfProduction;
import com.yesipchuk.demo.service.typeOfProduction.impls.TypeOfProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfProductionController {
    @Autowired
    TypeOfProductionService typeOfProductionService;

    @RequestMapping("/type/production")
    public List<TypeOfProduction> showTypesOfProduction() throws SQLException {
        return typeOfProductionService.getAll();
    }

    @RequestMapping("/type/production/del")
    public TypeOfProduction deleteTypeOfProduction(@RequestParam int id) throws SQLException {
        return typeOfProductionService.deleteTypeOfProduction(id);
    }

    @RequestMapping("/type/production/add")
    public TypeOfProduction addTypeOfProduction(@RequestParam int id, String nameOfType) throws SQLException {
        TypeOfProduction typeOfProduction = new TypeOfProduction(id, nameOfType);

        return typeOfProductionService.addTypeOfPrduction(typeOfProduction);
    }

    @RequestMapping("/type/production/upd")
    public TypeOfProduction updateTypeOfProduction(@RequestParam int id, String nameOfType) throws SQLException {
        TypeOfProduction typeOfProduction = new TypeOfProduction(id, nameOfType);

        return typeOfProductionService.updateTypeOfPrduction(typeOfProduction);
    }


}
