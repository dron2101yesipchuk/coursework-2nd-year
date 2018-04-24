package com.yesipchuk.demo.modelJDBC;

public class Ingredients {
  private Long id;
  private String name;
  private Long critical_rate;
  private Long amount;
  private Double price;

  public Ingredients(Long id, String name, Long critical_rate, Long amount, Double price) {
    this.id = id;
    this.name = name;
    this.critical_rate = critical_rate;
    this.amount = amount;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getCritical_rate() {
    return critical_rate;
  }

  public void setCritical_rate(Long critical_rate) {
    this.critical_rate = critical_rate;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
