package com.yesipchuk.demo.DAO.orderStatus.interfaces;

import com.yesipchuk.demo.model.OrderStatus;

import java.sql.SQLException;
import java.util.List;

public interface IOrderStatusDao {
    public List<OrderStatus> getAll() throws SQLException;
    public OrderStatus deleteOrderStatus(int id) throws SQLException;
}
