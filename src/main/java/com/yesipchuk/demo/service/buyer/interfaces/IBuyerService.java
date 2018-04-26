package com.yesipchuk.demo.service.buyer.interfaces;

import com.yesipchuk.demo.model.Buyer;

import java.sql.SQLException;
import java.util.List;

public interface IBuyerService {
    public List<Buyer> getAll() throws SQLException;
    public Buyer deleteBuyer(int id) throws SQLException;
    public Buyer addBuyer(Buyer buyer) throws SQLException;
    public Buyer updateBuyer(Buyer buyer) throws SQLException;
}
