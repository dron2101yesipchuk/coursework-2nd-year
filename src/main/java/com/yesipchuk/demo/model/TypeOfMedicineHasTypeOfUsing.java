package com.yesipchuk.demo.model;

public class TypeOfMedicineHasTypeOfUsing {
    private Integer id;
    private TypeOfMedicine typeOfMedicine;
    private TypeOfUsing typeOfUsing;

    public TypeOfMedicineHasTypeOfUsing() {
    }

    public TypeOfMedicineHasTypeOfUsing(Integer id, TypeOfMedicine typeOfMedicine, TypeOfUsing typeOfUsing) {
        this.id = id;
        this.typeOfMedicine = typeOfMedicine;
        this.typeOfUsing = typeOfUsing;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypeOfMedicine getTypeOfMedicine() {
        return typeOfMedicine;
    }

    public void setTypeOfMedicine(TypeOfMedicine typeOfMedicine) {
        this.typeOfMedicine = typeOfMedicine;
    }

    public TypeOfUsing getTypeOfUsing() {
        return typeOfUsing;
    }

    public void setTypeOfUsing(TypeOfUsing typeOfUsing) {
        this.typeOfUsing = typeOfUsing;
    }
}
