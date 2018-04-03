package com.yesipchuk.demo.model;

public class DatesOfOrderingAndReceiving {
    private Integer id;
    private String dateOfOrdering;
    private String dateOfReceiving;
    private OrderStatus orderStatus;

    public DatesOfOrderingAndReceiving() {
    }

    public DatesOfOrderingAndReceiving(Integer id, String dateOfOrdering,
                                       String dateOfReceiving, OrderStatus orderStatus) {
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

    public String getDateOfOrdering() {
        return dateOfOrdering;
    }

    public void setDateOfOrdering(String dateOfOrdering) {
        this.dateOfOrdering = dateOfOrdering;
    }

    public String getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(String dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
