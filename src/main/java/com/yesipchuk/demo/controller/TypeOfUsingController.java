package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.TypeOfUsing;
import com.yesipchuk.demo.service.typeOfUsing.impls.TypeOfUsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfUsingController {
    @Autowired
    TypeOfUsingService typeOfUsingService;

    @RequestMapping("/type/using")
    public List<TypeOfUsing> showTypesOfUsing() throws SQLException {
        return typeOfUsingService.getAll();
    }

    @RequestMapping("/type/using/del")
    public TypeOfUsing deleteTypeOfUsing(@RequestParam int id) throws SQLException {
        return typeOfUsingService.deleteTypeOfUsing(id);
    }

    @RequestMapping("/type/using/add")
    public TypeOfUsing addTypeOfUsing(@RequestParam int id, String nameOfType) throws SQLException {
        TypeOfUsing typeOfUsing = new TypeOfUsing(id, nameOfType);

        return typeOfUsingService.addTypeOfUsing(typeOfUsing);
    }

    @RequestMapping("/type/using/upd")
    public TypeOfUsing updateTypeOfUsing(@RequestParam int id, String nameOfType) throws SQLException {
        TypeOfUsing typeOfUsing = new TypeOfUsing(id, nameOfType);

        return typeOfUsingService.updateTypeOfUsing(typeOfUsing);
    }


}
