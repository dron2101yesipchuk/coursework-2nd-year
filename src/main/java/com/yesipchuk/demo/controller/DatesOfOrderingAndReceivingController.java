package com.yesipchuk.demo.controller;

import com.yesipchuk.demo.model.DatesOfOrderingAndReceiving;
import com.yesipchuk.demo.model.OrderStatus;
import com.yesipchuk.demo.service.datesOfOrderingAndReceiving.impls.DatesOfOrderingAndReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DatesOfOrderingAndReceivingController {
    @Autowired
    DatesOfOrderingAndReceivingService datesOfOrderingAndReceivingService;

    @RequestMapping("/dates")
    public List<DatesOfOrderingAndReceiving> showDates() throws SQLException {
        return datesOfOrderingAndReceivingService.getAll();
    }

    @RequestMapping("/dates/del")
    public DatesOfOrderingAndReceiving deleteDate(@RequestParam int id) throws SQLException {
        return datesOfOrderingAndReceivingService.deleteDate(id);
    }

    @RequestMapping("/dates/add")
    public DatesOfOrderingAndReceiving addDate(@RequestParam int id, Date dateOfOrdering,
                                               Date dateOfReceiving, int orderStatus_id) throws SQLException {
        DatesOfOrderingAndReceiving date = new DatesOfOrderingAndReceiving(
                id,
                dateOfOrdering,
                dateOfReceiving,
                new OrderStatus(orderStatus_id, null)
        );
        return datesOfOrderingAndReceivingService.addDate(date);
    }

    @RequestMapping("/dates/upd")
    public DatesOfOrderingAndReceiving updateDate(@RequestParam int id, Date dateOfOrdering,
                                               Date dateOfReceiving, int orderStatus_id) throws SQLException {
        DatesOfOrderingAndReceiving date = new DatesOfOrderingAndReceiving(
                id,
                dateOfOrdering,
                dateOfReceiving,
                new OrderStatus(orderStatus_id, null)
        );
        return datesOfOrderingAndReceivingService.updateDate(date);
    }


}
