package com.yesipchuk.demo.model;

public class TypeOfUsing {
    private Integer id;
    private String nameOfType;

    public TypeOfUsing() {
    }

    public TypeOfUsing(Integer id, String nameOfType) {
        this.id = id;
        this.nameOfType = nameOfType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }
}
