package com.yesipchuk.demo.model;

public class OrderStatus {
    private Integer id;
    private String nameOfStatus;

    public OrderStatus() {
    }

    public OrderStatus(int id, String nameOfStatus) {
        this.id = id;
        this.nameOfStatus = nameOfStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfStatus() {
        return nameOfStatus;
    }

    public void setNameOfStatus(String nameOfStatus) {
        this.nameOfStatus = nameOfStatus;
    }
}
