package com.yesipchuk.demo.DAO.typeOfProduction.interfaces;

import com.yesipchuk.demo.model.TypeOfProduction;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfProductionDao {
    public List<TypeOfProduction> getAll() throws SQLException;
    public TypeOfProduction deleteTypeOfProduction(int id) throws SQLException;
}
