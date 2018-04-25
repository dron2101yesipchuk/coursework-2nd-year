package com.yesipchuk.demo.model;

public class MedicineHasIngredients {
    private Integer id;
    private Medicine medicine;
    private Ingredients ingredients;
    private Integer amountOfIngredients;

    public MedicineHasIngredients() {
    }

    public MedicineHasIngredients(Integer id, Medicine medicine, Ingredients ingredients,
                                  Integer amountOfIngredients) {
        this.id = id;
        this.medicine = medicine;
        this.ingredients = ingredients;
        this.amountOfIngredients = amountOfIngredients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
