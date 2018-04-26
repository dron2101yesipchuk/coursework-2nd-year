package com.yesipchuk.demo.service.typeOfMedicineHasTypeOfUsing.interfaces;

import com.yesipchuk.demo.model.TypeOfMedicineHasTypeOfUsing;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicineHasTypeOfUsingService {
    public List<TypeOfMedicineHasTypeOfUsing> getAll() throws SQLException;
    public TypeOfMedicineHasTypeOfUsing deleteTypeOfMedicineHasTypeOfUsing(int id) throws SQLException;
    public TypeOfMedicineHasTypeOfUsing addTypeOfMedicineHasTypeOfUsing(
            TypeOfMedicineHasTypeOfUsing typeOfMedicineHasTypeOfUsing) throws SQLException;
    public TypeOfMedicineHasTypeOfUsing updateTypeOfMedicineHasTypeOfUsing(
            TypeOfMedicineHasTypeOfUsing typeOfMedicineHasTypeOfUsing) throws SQLException;
}
