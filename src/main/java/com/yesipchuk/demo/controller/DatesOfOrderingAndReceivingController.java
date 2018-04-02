package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;
import com.yesipchuk.demo.service.datesOfOrderingAndReceiving.impls.DatesOfOrderingAndReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DatesOfOrderingAndReceivingController {
    @Autowired
    DatesOfOrderingAndReceivingService datesOfOrderingAndReceivingService;

    @RequestMapping("/dates")
    public List<DatesOfOrderingAndReceiving> showBuyers(){
        return datesOfOrderingAndReceivingService.getAll();
    }
}
