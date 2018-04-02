package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.service.typeOfMedicine.impls.TypeOfMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfMedicineController {
    @Autowired
    TypeOfMedicineService typeOfMedicineService;

    @RequestMapping("/type/medicine")
    public List<TypeOfMedicine> showBuyers(){
        return typeOfMedicineService.getAll();
    }
}
