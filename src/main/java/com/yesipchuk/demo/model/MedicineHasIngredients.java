package com.yesipchuk.demo.model;

public class MedicineHasIngredients {
    private Medicine medicine;
    private Ingredients ingredients;
    private Integer amountOfIngredients;

    public MedicineHasIngredients() {
    }

    public MedicineHasIngredients(Medicine medicine, Ingredients ingredients,
                                  Integer amountOfIngredients) {
        this.medicine = medicine;
        this.ingredients = ingredients;
        this.amountOfIngredients = amountOfIngredients;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getAmountOfIngredients() {
        return amountOfIngredients;
    }

    public void setAmountOfIngredients(Integer amountOfIngredients) {
        this.amountOfIngredients = amountOfIngredients;
    }
}
