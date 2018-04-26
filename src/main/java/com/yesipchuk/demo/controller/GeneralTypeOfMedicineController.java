package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import com.yesipchuk.demo.service.generalTypeOfMedicine.impls.GeneralTypeOfMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GeneralTypeOfMedicineController {
    @Autowired
    GeneralTypeOfMedicineService generalTypeOfMedicineService;

    @RequestMapping("/general_types")
    public List<GeneralTypeOfMedicine> showGeneralTypes() throws SQLException {
        return generalTypeOfMedicineService.getAll();
    }

    @RequestMapping("/general_types/del")
    public GeneralTypeOfMedicine deleteGeneralType(@RequestParam int id) throws SQLException{
        return generalTypeOfMedicineService.deleteGeneralType(id);
    }

    @RequestMapping("/general_types/add")
    public GeneralTypeOfMedicine addGeneralType(@RequestParam int id, String generalType) throws SQLException{
        GeneralTypeOfMedicine generalTypeOfMedicine = new GeneralTypeOfMedicine(id, generalType);
        return generalTypeOfMedicineService.addGeneralType(generalTypeOfMedicine);
    }

    @RequestMapping("/general_types/upd")
    public GeneralTypeOfMedicine updateGeneralType(@RequestParam int id, String generalType) throws SQLException{
        GeneralTypeOfMedicine generalTypeOfMedicine = new GeneralTypeOfMedicine(id, generalType);
        return generalTypeOfMedicineService.updateGeneralType(generalTypeOfMedicine);
    }


}
