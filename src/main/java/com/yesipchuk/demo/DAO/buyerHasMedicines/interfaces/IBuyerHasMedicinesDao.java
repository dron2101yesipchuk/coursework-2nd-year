package com.yesipchuk.demo.DAO.buyerHasMedicines.interfaces;

import com.yesipchuk.demo.modelJDBC.BuyerHasMedicines;

import java.sql.SQLException;
import java.util.List;

public interface IBuyerHasMedicinesDao {
    public List<BuyerHasMedicines> getAll() throws SQLException;
}
