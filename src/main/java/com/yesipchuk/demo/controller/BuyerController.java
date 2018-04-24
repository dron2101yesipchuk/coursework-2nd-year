package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.modelJDBC.Buyer;
import com.yesipchuk.demo.service.buyer.impls.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyerController {
    @Autowired
    BuyerService buyerService;

    @RequestMapping("/buyers")
    public List<Buyer> showBuyers() throws SQLException {
        return buyerService.getAll();
    }
}
