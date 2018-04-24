package com.yesipchuk.demo.modelJDBC;

import java.sql.Date;

public class DatesOfOrderingAndReceiving {
  private Long id;
  private java.sql.Date date_of_ordering;
  private java.sql.Date date_of_receiving;
  private Long order_status_id;

  public DatesOfOrderingAndReceiving(Long id, Date date_of_ordering,
                                     Date date_of_receiving, Long order_status_id) {
    this.id = id;
    this.date_of_ordering = date_of_ordering;
    this.date_of_receiving = date_of_receiving;
    this.order_status_id = order_status_id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public java.sql.Date getDate_of_ordering() {
    return date_of_ordering;
  }

  public void setDate_of_ordering(java.sql.Date date_of_ordering) {
    this.date_of_ordering = date_of_ordering;
  }

  public java.sql.Date getDate_of_receiving() {
    return date_of_receiving;
  }

  public void setDate_of_receiving(java.sql.Date date_of_receiving) {
    this.date_of_receiving = date_of_receiving;
  }

  public Long getOrder_status_id() {
    return order_status_id;
  }

  public void setOrder_status_id(Long order_status_id) {
    this.order_status_id = order_status_id;
  }
}
