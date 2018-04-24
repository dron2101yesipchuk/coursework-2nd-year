package com.yesipchuk.demo.service.buyerHasMedicines.interfaces;

import com.yesipchuk.demo.modelJDBC.BuyerHasMedicines;

import java.sql.SQLException;
import java.util.List;

public interface IBuyerHasMedicinesService {
    public List<BuyerHasMedicines> getAll() throws SQLException;
}
