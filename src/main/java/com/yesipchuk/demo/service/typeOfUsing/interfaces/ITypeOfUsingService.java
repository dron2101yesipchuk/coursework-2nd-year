package com.yesipchuk.demo.service.typeOfUsing.interfaces;

import com.yesipchuk.demo.modelJDBC.TypeOfUsing;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfUsingService {
    public List<TypeOfUsing> getAll() throws SQLException;
}
