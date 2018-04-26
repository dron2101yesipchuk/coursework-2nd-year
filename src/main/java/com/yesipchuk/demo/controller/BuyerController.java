package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.Buyer;
import com.yesipchuk.demo.service.buyer.impls.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/buyers/del")
    public Buyer deleteBuyer(@RequestParam int id) throws SQLException{
        return buyerService.deleteBuyer(id);
    }

    @RequestMapping("/buyers/add")
    public Buyer addBuyer(@RequestParam int id, String PIB, int age) throws SQLException{
        Buyer buyer = new Buyer(id, PIB, age);
        return buyerService.addBuyer(buyer);
    }

    @RequestMapping("/buyers/upd")
    public Buyer updateBuyer(@RequestParam int id, String PIB, int age) throws SQLException{
        Buyer buyer = new Buyer(id, PIB, age);
        return buyerService.updateBuyer(buyer);
    }
}
