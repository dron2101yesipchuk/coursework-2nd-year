package com.yesipchuk.demo.DAO.typeOfMedicine.interfaces;

import com.yesipchuk.demo.model.TypeOfMedicine;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicinesDao {
    public List<TypeOfMedicine> getAll() throws SQLException;
    public TypeOfMedicine deleteTypeOfMedicine(int id) throws SQLException;
}
