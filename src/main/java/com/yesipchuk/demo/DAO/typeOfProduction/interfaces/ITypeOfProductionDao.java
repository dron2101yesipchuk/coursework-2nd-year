package com.yesipchuk.demo.DAO.typeOfProduction.interfaces;

import com.yesipchuk.demo.modelJDBC.TypeOfProduction;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfProductionDao {
    public List<TypeOfProduction> getAll() throws SQLException;
}
