package com.yesipchuk.demo.DAO.typeOfMedicine.interfaces;

import com.yesipchuk.demo.modelJDBC.TypeOfMedicine;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicinesDao {
    public List<TypeOfMedicine> getAll() throws SQLException;
}
