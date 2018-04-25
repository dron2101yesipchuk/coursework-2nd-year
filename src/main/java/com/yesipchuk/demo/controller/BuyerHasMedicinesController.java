package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.BuyersHasMedicines;
import com.yesipchuk.demo.service.buyerHasMedicines.impls.BuyerHasMedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyerHasMedicinesController {
    @Autowired
    BuyerHasMedicinesService buyerHasMedicinesService;

    @RequestMapping("/buyer_has_medicines")
    public List<BuyersHasMedicines> showBuyerHasMedicines() throws SQLException {
        return buyerHasMedicinesService.getAll();
    }

    @RequestMapping("/buyer_has_medicines/del")
    public BuyersHasMedicines deleteBuyerHasMedicines(@RequestParam int id) throws SQLException {
        return buyerHasMedicinesService.deleteBuyerHasMedicines(id);
    }
}
