package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.modelJDBC.BuyerHasMedicines;
import com.yesipchuk.demo.service.buyerHasMedicines.impls.BuyerHasMedicinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyerHasMedicinesController {
    @Autowired
    BuyerHasMedicinesService buyerHasMedicinesService;

    @RequestMapping("/buyer_has_medicines")
    public List<BuyerHasMedicines> showBuyerHasMedicines() throws SQLException {
        return buyerHasMedicinesService.getAll();
    }
}
