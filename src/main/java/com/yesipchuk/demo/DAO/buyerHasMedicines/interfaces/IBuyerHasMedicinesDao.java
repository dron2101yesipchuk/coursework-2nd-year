package com.yesipchuk.demo.DAO.buyerHasMedicines.interfaces;

import com.yesipchuk.demo.model.BuyersHasMedicines;

import java.sql.SQLException;
import java.util.List;

public interface IBuyerHasMedicinesDao {
    public List<BuyersHasMedicines> getAll() throws SQLException;
    public BuyersHasMedicines deleteBuyerHasMedicines(int id) throws SQLException;
}
