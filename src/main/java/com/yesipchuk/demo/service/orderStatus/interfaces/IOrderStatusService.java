package com.yesipchuk.demo.service.orderStatus.interfaces;

import com.yesipchuk.demo.model.OrderStatus;

import java.sql.SQLException;
import java.util.List;

public interface IOrderStatusService {
    public List<OrderStatus> getAll() throws SQLException;
    public OrderStatus deleteOrderStatus(int id) throws SQLException;
    public OrderStatus addOrderStatus(OrderStatus orderStatus) throws SQLException;
    public OrderStatus updateOrderStatus(OrderStatus orderStatus) throws SQLException;
}
