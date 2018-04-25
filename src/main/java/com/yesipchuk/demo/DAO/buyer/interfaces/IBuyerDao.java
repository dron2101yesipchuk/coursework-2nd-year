package com.yesipchuk.demo.DAO.buyer.interfaces;

import com.yesipchuk.demo.model.Buyer;

import java.sql.SQLException;
import java.util.List;

public interface IBuyerDao {
    public List<Buyer> getAll() throws SQLException;
}
