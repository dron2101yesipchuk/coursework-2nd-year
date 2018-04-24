package com.yesipchuk.demo.service.typeOfMedicine.interfaces;

import com.yesipchuk.demo.modelJDBC.TypeOfMedicine;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicineService {
    public List<TypeOfMedicine> getAll() throws SQLException;
}
