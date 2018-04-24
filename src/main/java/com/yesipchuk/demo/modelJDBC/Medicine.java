package com.yesipchuk.demo.modelJDBC;

import java.sql.Date;

public class Medicine {
  private Long id;
  private String name_of_medicine;
  private Long type_of_medicine_id;
  private Long critical_rate;
  private Long amount;
  private Double price;
  private java.sql.Date manufacture_date;
  private Long expiration_term;

  public Medicine(Long id, String name_of_medicine, Long type_of_medicine_id, Long critical_rate,
                  Long amount, Double price, Date manufacture_date, Long expiration_term) {
    this.id = id;
    this.name_of_medicine = name_of_medicine;
    this.type_of_medicine_id = type_of_medicine_id;
    this.critical_rate = critical_rate;
    this.amount = amount;
    this.price = price;
    this.manufacture_date = manufacture_date;
    this.expiration_term = expiration_term;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName_of_medicine() {
    return name_of_medicine;
  }

  public void setName_of_medicine(String name_of_medicine) {
    this.name_of_medicine = name_of_medicine;
  }

  public Long getType_of_medicine_id() {
    return type_of_medicine_id;
  }

  public void setType_of_medicine_id(Long type_of_medicine_id) {
    this.type_of_medicine_id = type_of_medicine_id;
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

  public java.sql.Date getManufacture_date() {
    return manufacture_date;
  }

  public void setManufacture_date(java.sql.Date manufacture_date) {
    this.manufacture_date = manufacture_date;
  }

  public Long getExpiration_term() {
    return expiration_term;
  }

  public void setExpiration_term(Long expiration_term) {
    this.expiration_term = expiration_term;
  }
}
