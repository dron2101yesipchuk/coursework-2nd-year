package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.Medicine;
import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.service.medicine.impls.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @RequestMapping("/medicine")
    public List<Medicine> showMedicine() throws SQLException {
        return medicineService.getAll();
    }

    @RequestMapping("/medicine/del")
    public Medicine deleteMedicine(@RequestParam int id) throws SQLException {
        return medicineService.deleteMedicine(id);
    }

    @RequestMapping("/medicine/add")
    public Medicine addMedicine(@RequestParam int id, String nameOfMedicine, int type_id,
                                int criticalRate, int amount, double price,
                                Date manufactureDate, int expirationTerm) throws SQLException {
        Medicine medicine = new Medicine(
            id,
            nameOfMedicine,
            new TypeOfMedicine(type_id, null, null, null),
            criticalRate,
            amount,
            price,
            manufactureDate,
            expirationTerm
        );

        return medicineService.addMedicine(medicine);
    }

    @RequestMapping("/medicine/upd")
    public Medicine updateMedicine(@RequestParam int id, String nameOfMedicine, int type_id,
                                int criticalRate, int amount, double price,
                                Date manufactureDate, int expirationTerm) throws SQLException {
        Medicine medicine = new Medicine(
            id,
            nameOfMedicine,
            new TypeOfMedicine(type_id, null, null, null),
            criticalRate,
            amount,
            price,
            manufactureDate,
            expirationTerm
        );

        return medicineService.updateMedicine(medicine);
    }


}
