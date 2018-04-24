package com.yesipchuk.demo.service.buyer.interfaces;

import com.yesipchuk.demo.modelJDBC.Buyer;

import java.sql.SQLException;
import java.util.List;

public interface IBuyerService {
    public List<Buyer> getAll() throws SQLException;
}
