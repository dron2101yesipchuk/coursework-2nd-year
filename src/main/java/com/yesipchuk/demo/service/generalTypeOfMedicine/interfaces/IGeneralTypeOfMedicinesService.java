package com.yesipchuk.demo.service.generalTypeOfMedicine.interfaces;

import com.yesipchuk.demo.model.GeneralTypeOfMedicine;

import java.sql.SQLException;
import java.util.List;

public interface IGeneralTypeOfMedicinesService {
    public List<GeneralTypeOfMedicine> getAll() throws SQLException;
    public GeneralTypeOfMedicine deleteGeneralType(int id) throws SQLException;
    public GeneralTypeOfMedicine addGeneralType(GeneralTypeOfMedicine generalTypeOfMedicine) throws SQLException;
    public GeneralTypeOfMedicine updateGeneralType(GeneralTypeOfMedicine generalTypeOfMedicine) throws SQLException;
}
