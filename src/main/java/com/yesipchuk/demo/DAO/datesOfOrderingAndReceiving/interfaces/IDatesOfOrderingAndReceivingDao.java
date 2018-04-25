package com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.interfaces;

import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;

import java.sql.SQLException;
import java.util.List;

public interface IDatesOfOrderingAndReceivingDao {
    public List<DatesOfOrderingAndReceiving> getAll() throws SQLException;
}
