package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.modelJDBC.TypeOfProduction;
import com.yesipchuk.demo.service.typeOfProduction.impls.TypeOfProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
