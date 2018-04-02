package com.yesipchuk.demo.model;

public class TypeOfMedicine {
    private Integer id;
    private String nameOfType;
    private GeneralTypeOfMedicine generalType;
    private TypeOfProduction typeOfProduction;

    public TypeOfMedicine() {
    }

    public TypeOfMedicine(Integer id, String nameOfType,
                          GeneralTypeOfMedicine generalType, TypeOfProduction typeOfProduction) {
        this.id = id;
        this.nameOfType = nameOfType;
        this.generalType = generalType;
        this.typeOfProduction = typeOfProduction;
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

    public GeneralTypeOfMedicine getGeneralType() {
        return generalType;
    }

    public void setGeneralType(GeneralTypeOfMedicine generalType) {
        this.generalType = generalType;
    }

    public TypeOfProduction getTypeOfProduction() {
        return typeOfProduction;
    }

    public void setTypeOfProduction(TypeOfProduction typeOfProduction) {
        this.typeOfProduction = typeOfProduction;
    }
}
