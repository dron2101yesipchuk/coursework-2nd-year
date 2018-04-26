package com.yesipchuk.demo.DAO.medicine.interfaces;

import com.yesipchuk.demo.model.Medicine;

import java.sql.SQLException;
import java.util.List;

public interface IMedicineDao {
    public List<Medicine> getAll() throws SQLException;
    public Medicine deleteMedicine(int id) throws SQLException;
    public Medicine addMedicine(Medicine medicine) throws SQLException;
    public Medicine updateMedicine(Medicine medicine) throws SQLException;
}
