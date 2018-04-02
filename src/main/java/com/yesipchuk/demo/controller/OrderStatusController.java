package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.OrderStatus;
import com.yesipchuk.demo.service.orderStatus.impls.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderStatusController {
    @Autowired
    OrderStatusService orderStatusService;

    @RequestMapping("/order_status")
    public List<OrderStatus> showBuyers(){
        return orderStatusService.getAll();
    }
}
