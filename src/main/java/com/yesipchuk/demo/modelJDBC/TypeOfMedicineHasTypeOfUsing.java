package com.yesipchuk.demo.modelJDBC;

public class TypeOfMedicineHasTypeOfUsing {
  private Long type_of_medicine_id;
  private Long type_of_using_id;

  public TypeOfMedicineHasTypeOfUsing(Long type_of_medicine_id, Long type_of_using_id) {
    this.type_of_medicine_id = type_of_medicine_id;
    this.type_of_using_id = type_of_using_id;
  }

  public Long getType_of_medicine_id() {
    return type_of_medicine_id;
  }

  public void setType_of_medicine_id(Long type_of_medicine_id) {
    this.type_of_medicine_id = type_of_medicine_id;
  }

  public Long getType_of_using_id() {
    return type_of_using_id;
  }

  public void setType_of_using_id(Long type_of_using_id) {
    this.type_of_using_id = type_of_using_id;
  }
}
