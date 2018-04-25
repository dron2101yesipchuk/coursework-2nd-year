package com.yesipchuk.demo.service.typeOfProduction.interfaces;

import com.yesipchuk.demo.model.TypeOfProduction;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfProductionService {
    public List<TypeOfProduction> getAll() throws SQLException;
}
