package com.yesipchuk.demo.service.typeOfMedicine.interfaces;

import com.yesipchuk.demo.model.TypeOfMedicine;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicineService {
    public List<TypeOfMedicine> getAll() throws SQLException;
    public TypeOfMedicine deleteTypeOfMedicine(int id) throws SQLException;
}
