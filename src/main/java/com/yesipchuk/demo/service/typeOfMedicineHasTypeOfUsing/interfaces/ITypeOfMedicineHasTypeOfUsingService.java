package com.yesipchuk.demo.service.typeOfMedicineHasTypeOfUsing.interfaces;

import com.yesipchuk.demo.modelJDBC.TypeOfMedicineHasTypeOfUsing;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicineHasTypeOfUsingService {
    public List<TypeOfMedicineHasTypeOfUsing> getAll() throws SQLException;
}
