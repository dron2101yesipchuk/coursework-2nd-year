package com.yesipchuk.demo.DAO.typeOfUsing.interfaces;

import com.yesipchuk.demo.model.TypeOfUsing;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfUsingDao {
    public List<TypeOfUsing> getAll() throws SQLException;
}
