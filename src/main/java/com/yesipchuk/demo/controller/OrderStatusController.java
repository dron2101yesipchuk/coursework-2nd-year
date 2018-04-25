package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.OrderStatus;
import com.yesipchuk.demo.service.orderStatus.impls.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderStatusController {
    @Autowired
    OrderStatusService orderStatusService;

    @RequestMapping("/order_status")
    public List<OrderStatus> showOrderStatus() throws SQLException {
        return orderStatusService.getAll();
    }

    @RequestMapping("/order_status/del")
    public OrderStatus deleteOrderStatus(@RequestParam int id) throws SQLException {
        return orderStatusService.deleteOrderStatus(id);
    }
}
