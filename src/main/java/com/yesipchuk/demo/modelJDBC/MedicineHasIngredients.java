package com.yesipchuk.demo.modelJDBC;

public class MedicineHasIngredients {
  private Long medicine_id;
  private Long ingredients_id;
  private Long amount_of_ingredients;

  public MedicineHasIngredients(Long medicine_id, Long ingredients_id,
                                Long amount_of_ingredients) {
    this.medicine_id = medicine_id;
    this.ingredients_id = ingredients_id;
    this.amount_of_ingredients = amount_of_ingredients;
  }

  public Long getMedicine_id() {
    return medicine_id;
  }

  public void setMedicine_id(Long medicine_id) {
    this.medicine_id = medicine_id;
  }

  public Long getIngredients_id() {
    return ingredients_id;
  }

  public void setIngredients_id(Long ingredients_id) {
    this.ingredients_id = ingredients_id;
  }

  public Long getAmount_of_ingredients() {
    return amount_of_ingredients;
  }

  public void setAmount_of_ingredients(Long amount_of_ingredients) {
    this.amount_of_ingredients = amount_of_ingredients;
  }
}
