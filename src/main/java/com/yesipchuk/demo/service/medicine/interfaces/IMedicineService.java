package com.yesipchuk.demo.service.medicine.interfaces;

import com.yesipchuk.demo.model.Medicine;

import java.sql.SQLException;
import java.util.List;

public interface IMedicineService {
    public List<Medicine> getAll() throws SQLException;
}
