package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.Medicine;
import com.yesipchuk.demo.service.medicine.impls.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @RequestMapping("/medicine")
    public List<Medicine> showBuyers(){
        return medicineService.getAll();
    }
}
