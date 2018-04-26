package com.yesipchuk.demo.DAO.generalTypeOfMedicine.interfaces;

import com.yesipchuk.demo.model.GeneralTypeOfMedicine;

import java.sql.SQLException;
import java.util.List;

public interface IGeneralTypeOfMedicineDao {
    public List<GeneralTypeOfMedicine> getAll() throws SQLException;
    public GeneralTypeOfMedicine deleteGeneralType(int id) throws SQLException;
    public GeneralTypeOfMedicine addGeneralType(GeneralTypeOfMedicine generalType) throws SQLException;
    public GeneralTypeOfMedicine updateGeneralType(GeneralTypeOfMedicine generalType) throws SQLException;
}
