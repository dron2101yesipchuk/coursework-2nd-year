package com.yesipchuk.demo.modelJDBC;

public class Type_of_medicine {
  private Long id;
  private String name_of_type;
  private Long general_type_of_medicine_id;
  private Long type_of_production_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName_of_type() {
    return name_of_type;
  }

  public void setName_of_type(String name_of_type) {
    this.name_of_type = name_of_type;
  }

  public Long getGeneral_type_of_medicine_id() {
    return general_type_of_medicine_id;
  }

  public void setGeneral_type_of_medicine_id(Long general_type_of_medicine_id) {
    this.general_type_of_medicine_id = general_type_of_medicine_id;
  }

  public Long getType_of_production_id() {
    return type_of_production_id;
  }

  public void setType_of_production_id(Long type_of_production_id) {
    this.type_of_production_id = type_of_production_id;
  }
}
