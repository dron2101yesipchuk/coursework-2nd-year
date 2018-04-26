package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.GeneralTypeOfMedicine;
import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.model.TypeOfProduction;
import com.yesipchuk.demo.service.typeOfMedicine.impls.TypeOfMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfMedicineController {
    @Autowired
    TypeOfMedicineService typeOfMedicineService;

    @RequestMapping("/type/medicine")
    public List<TypeOfMedicine> showTypeOfMedicine() throws SQLException {
        return typeOfMedicineService.getAll();
    }

    @RequestMapping("/type/medicine/del")
    public TypeOfMedicine deleteTypeOfMedicine(@RequestParam int id) throws SQLException {
        return typeOfMedicineService.deleteTypeOfMedicine(id);
    }

    @RequestMapping("/type/medicine/add")
    public TypeOfMedicine addTypeOfMedicine(@RequestParam int id, String nameOfType,
                                               int gen_type_id, int production_id) throws SQLException {
        TypeOfMedicine typeOfMedicine = new TypeOfMedicine(
                id,
                nameOfType,
                new GeneralTypeOfMedicine(gen_type_id, null),
                new TypeOfProduction(production_id, null)
        );
        return typeOfMedicineService.addTypeOfMedicine(typeOfMedicine);
    }

    @RequestMapping("/type/medicine/upd")
    public TypeOfMedicine updateTypeOfMedicine(@RequestParam int id, String nameOfType,
                                               int gen_type_id, int production_id) throws SQLException {
        TypeOfMedicine typeOfMedicine = new TypeOfMedicine(
                id,
                nameOfType,
                new GeneralTypeOfMedicine(gen_type_id, null),
                new TypeOfProduction(production_id, null)
        );
        return typeOfMedicineService.updateTypeOfMedicine(typeOfMedicine);
    }


}
