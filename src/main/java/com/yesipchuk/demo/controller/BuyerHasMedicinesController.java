package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.Buyer;
import com.yesipchuk.demo.model.BuyersHasMedicines;
import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;
import com.yesipchuk.demo.model.Medicine;
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

    @RequestMapping("/buyer_has_medicines/add")
    public BuyersHasMedicines addBuyerHasMedicines(@RequestParam int id, int buyer_id,
                                                   int medicine_id, int dates_id, String doctorPIB,
                                                   String diagnosis, int amount) throws SQLException {
        BuyersHasMedicines buyersHasMedicines = new BuyersHasMedicines(
                id,
                new Buyer(buyer_id, null, null),
                new Medicine(medicine_id, null, null, null,
                        null, null, null, null),
                new DatesOfOrderingAndReceiving(dates_id, null, null, null),
                doctorPIB,
                diagnosis,
                amount
        );
        return buyerHasMedicinesService.addBuyerHasMedicines(buyersHasMedicines);
    }

    @RequestMapping("/buyer_has_medicines/upd")
    public BuyersHasMedicines updateBuyerHasMedicines(@RequestParam int id, int buyer_id,
                                                   int medicine_id, int dates_id, String doctorPIB,
                                                   String diagnosis, int amount) throws SQLException {
        BuyersHasMedicines buyersHasMedicines = new BuyersHasMedicines(
                id,
                new Buyer(buyer_id, null, null),
                new Medicine(medicine_id, null, null, null,
                        null, null, null, null),
                new DatesOfOrderingAndReceiving(dates_id, null, null, null),
                doctorPIB,
                diagnosis,
                amount
        );
        return buyerHasMedicinesService.updateBuyerHasMedicines(buyersHasMedicines);
    }
}
