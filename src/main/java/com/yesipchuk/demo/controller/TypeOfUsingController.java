package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.TypeOfUsing;
import com.yesipchuk.demo.service.typeOfUsing.impls.TypeOfUsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfUsingController {
    @Autowired
    TypeOfUsingService typeOfUsingService;

    @RequestMapping("/type/using")
    public List<TypeOfUsing> showBuyers(){
        return typeOfUsingService.getAll();
    }
}
