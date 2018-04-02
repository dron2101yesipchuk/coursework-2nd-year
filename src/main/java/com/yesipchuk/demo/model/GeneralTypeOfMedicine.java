package com.yesipchuk.demo.model;

public class GeneralTypeOfMedicine {
    private Integer id;
    private String nameOfGeneralType;

    public GeneralTypeOfMedicine() {
    }

    public GeneralTypeOfMedicine(Integer id, String nameOfGeneralType) {
        this.id = id;
        this.nameOfGeneralType = nameOfGeneralType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfGeneralType() {
        return nameOfGeneralType;
    }

    public void setNameOfGeneralType(String nameOfGeneralType) {
        this.nameOfGeneralType = nameOfGeneralType;
    }
}
