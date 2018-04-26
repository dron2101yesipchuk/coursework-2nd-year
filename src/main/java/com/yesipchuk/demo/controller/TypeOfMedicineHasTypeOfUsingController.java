package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.TypeOfMedicine;
import com.yesipchuk.demo.model.TypeOfMedicineHasTypeOfUsing;
import com.yesipchuk.demo.model.TypeOfUsing;
import com.yesipchuk.demo.service.typeOfMedicineHasTypeOfUsing.impls.TypeOfMedicineHasTypeOfUsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TypeOfMedicineHasTypeOfUsingController {
    @Autowired
    TypeOfMedicineHasTypeOfUsingService typeOfMedicineHasTypeOfUsingService;

    @RequestMapping("/type_medicine_has_type_using")
    public List<TypeOfMedicineHasTypeOfUsing> showTypeOfMedicineHasTypeOfUsing() throws SQLException {
        return typeOfMedicineHasTypeOfUsingService.getAll();
    }

    @RequestMapping("/type_medicine_has_type_using/del")
    public TypeOfMedicineHasTypeOfUsing deleteTypeOfMedicineHasTypeOfUsing(@RequestParam int id) throws SQLException{
        return typeOfMedicineHasTypeOfUsingService.deleteTypeOfMedicineHasTypeOfUsing(id);
    }

    @RequestMapping("/type_medicine_has_type_using/add")
    public TypeOfMedicineHasTypeOfUsing addTypeOfMedicineHasTypeOfUsing(@RequestParam int id,
                                                                        int type_of_medicine_id,
                                                                        int type_of_using_id)
                                                                        throws SQLException{
        TypeOfMedicineHasTypeOfUsing typeOfMedicineHasTypeOfUsing =
                new TypeOfMedicineHasTypeOfUsing(
                        id,
                        new TypeOfMedicine(type_of_medicine_id, null, null, null),
                        new TypeOfUsing(type_of_using_id, null)
                );

        return typeOfMedicineHasTypeOfUsingService.addTypeOfMedicineHasTypeOfUsing(typeOfMedicineHasTypeOfUsing);
    }

    @RequestMapping("/type_medicine_has_type_using/upd")
    public TypeOfMedicineHasTypeOfUsing updateTypeOfMedicineHasTypeOfUsing(@RequestParam int id,
                                                                        int type_of_medicine_id,
                                                                        int type_of_using_id)
                                                                        throws SQLException{
        TypeOfMedicineHasTypeOfUsing typeOfMedicineHasTypeOfUsing =
                new TypeOfMedicineHasTypeOfUsing(
                        id,
                        new TypeOfMedicine(type_of_medicine_id, null, null, null),
                        new TypeOfUsing(type_of_using_id, null)
                );

        return typeOfMedicineHasTypeOfUsingService.updateTypeOfMedicineHasTypeOfUsing(typeOfMedicineHasTypeOfUsing);
    }


}
