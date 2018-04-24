package com.yesipchuk.demo.service.orderStatus.interfaces;

import com.yesipchuk.demo.modelJDBC.OrderStatus;

import java.util.List;

public interface IOrderStatusService {
    public List<OrderStatus> getAll();
}
