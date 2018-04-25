package com.yesipchuk.demo.DAO.typeOfMedicineHasTypeOfUsing.interfaces;

import com.yesipchuk.demo.model.TypeOfMedicineHasTypeOfUsing;

import java.sql.SQLException;
import java.util.List;

public interface ITypeOfMedicineHasTypeOfUsingDao {
    public List<TypeOfMedicineHasTypeOfUsing> getAll() throws SQLException;
}
