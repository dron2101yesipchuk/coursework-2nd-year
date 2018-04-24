package com.yesipchuk.demo.modelJDBC;

public class OrderStatus {
  private Long id;
  private String name_of_status;

  public OrderStatus(Long id, String name_of_status) {
    this.id = id;
    this.name_of_status = name_of_status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName_of_status() {
    return name_of_status;
  }

  public void setName_of_status(String name_of_status) {
    this.name_of_status = name_of_status;
  }
}
