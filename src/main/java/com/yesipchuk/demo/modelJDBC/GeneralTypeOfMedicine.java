package com.yesipchuk.demo.modelJDBC;

public class GeneralTypeOfMedicine {
  private Long id;
  private String name_of_general_type;

  public GeneralTypeOfMedicine(Long id, String name_of_general_type) {
    this.id = id;
    this.name_of_general_type = name_of_general_type;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName_of_general_type() {
    return name_of_general_type;
  }

  public void setName_of_general_type(String name_of_general_type) {
    this.name_of_general_type = name_of_general_type;
  }
}
