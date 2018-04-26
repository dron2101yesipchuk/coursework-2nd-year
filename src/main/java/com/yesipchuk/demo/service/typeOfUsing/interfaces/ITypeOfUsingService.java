package com.yesipchuk.demo.service.typeOfUsing.interfaces;

import com.yesipchuk.demo.model.TypeOfUsing;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfUsingService {
    public List<TypeOfUsing> getAll() throws SQLException;
    public TypeOfUsing deleteTypeOfUsing(int id) throws SQLException;
    public TypeOfUsing addTypeOfUsing(TypeOfUsing typeOfUsing) throws SQLException;
    public TypeOfUsing updateTypeOfUsing(TypeOfUsing typeOfUsing) throws SQLException;
}
