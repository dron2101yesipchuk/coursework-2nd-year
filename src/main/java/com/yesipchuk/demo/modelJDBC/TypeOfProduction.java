package com.yesipchuk.demo.modelJDBC;

public class TypeOfProduction {
  private Long id;
  private String type_of_production;

  public TypeOfProduction(Long id, String type_of_production) {
    this.id = id;
    this.type_of_production = type_of_production;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getType_of_production() {
    return type_of_production;
  }

  public void setType_of_production(String type_of_production) {
    this.type_of_production = type_of_production;
  }
}
