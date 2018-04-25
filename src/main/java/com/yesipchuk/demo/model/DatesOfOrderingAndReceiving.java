package com.yesipchuk.demo.model;

import java.sql.Date;

public class DatesOfOrderingAndReceiving {
    private Integer id;
    private Date dateOfOrdering;
    private Date dateOfReceiving;
    private OrderStatus orderStatus;

    public DatesOfOrderingAndReceiving() {
    }

    public DatesOfOrderingAndReceiving(Integer id, Date dateOfOrdering,
                                       Date dateOfReceiving, OrderStatus orderStatus) {
        this.id = id;
        this.dateOfOrdering = dateOfOrdering;
        this.dateOfReceiving = dateOfReceiving;
        this.orderStatus = orderStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateOfOrdering() {
        return dateOfOrdering;
    }

    public void setDateOfOrdering(Date dateOfOrdering) {
        this.dateOfOrdering = dateOfOrdering;
    }

    public Date getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(Date dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
