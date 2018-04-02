package com.yesipchuk.demo.model;

public class TypeOfMedicineHasTypeOfUsing {
    private TypeOfMedicine typeOfMedicine;
    private TypeOfUsing typeOfUsing;

    public TypeOfMedicineHasTypeOfUsing() {
    }

    public TypeOfMedicineHasTypeOfUsing(TypeOfMedicine typeOfMedicine, TypeOfUsing typeOfUsing) {
        this.typeOfMedicine = typeOfMedicine;
        this.typeOfUsing = typeOfUsing;
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
