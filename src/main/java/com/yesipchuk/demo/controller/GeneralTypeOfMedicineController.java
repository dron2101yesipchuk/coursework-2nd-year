package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import com.yesipchuk.demo.service.generalTypeOfMedicine.impls.GeneralTypeOfMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GeneralTypeOfMedicineController {
    @Autowired
    GeneralTypeOfMedicineService generalTypeOfMedicineService;

    @RequestMapping("/general_types")
    public List<GeneralTypeOfMedicine> showBuyers(){
        return generalTypeOfMedicineService.getAll();
    }
}
