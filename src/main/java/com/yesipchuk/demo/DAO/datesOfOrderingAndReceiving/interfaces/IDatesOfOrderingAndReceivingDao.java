package com.yesipchuk.demo.DAO.datesOfOrderingAndReceiving.interfaces;

import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;

import java.sql.SQLException;
import java.util.List;

public interface IDatesOfOrderingAndReceivingDao {
    public List<DatesOfOrderingAndReceiving> getAll() throws SQLException;
    public DatesOfOrderingAndReceiving deleteDate(int id) throws SQLException;
    public DatesOfOrderingAndReceiving addDate(DatesOfOrderingAndReceiving dates) throws SQLException;
    public DatesOfOrderingAndReceiving updateDate(DatesOfOrderingAndReceiving dates) throws SQLException;
}
