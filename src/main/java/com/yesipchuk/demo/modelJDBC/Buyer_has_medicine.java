package com.yesipchuk.demo.modelJDBC;

public class Buyer_has_medicine {
  private Long buyer_id;
  private Long medicine_id;
  private Long dates_of_ordering_and_receiving_id;
  private String pib_of_doctor;
  private String diagnosis;
  private Long amount_of_medicine;

  public Long getBuyer_id() {
    return buyer_id;
  }

  public void setBuyer_id(Long buyer_id) {
    this.buyer_id = buyer_id;
  }

  public Long getMedicine_id() {
    return medicine_id;
  }

  public void setMedicine_id(Long medicine_id) {
    this.medicine_id = medicine_id;
  }

  public Long getDates_of_ordering_and_receiving_id() {
    return dates_of_ordering_and_receiving_id;
  }

  public void setDates_of_ordering_and_receiving_id(Long dates_of_ordering_and_receiving_id) {
    this.dates_of_ordering_and_receiving_id = dates_of_ordering_and_receiving_id;
  }

  public String getPib_of_doctor() {
    return pib_of_doctor;
  }

  public void setPib_of_doctor(String pib_of_doctor) {
    this.pib_of_doctor = pib_of_doctor;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public Long getAmount_of_medicine() {
    return amount_of_medicine;
  }

  public void setAmount_of_medicine(Long amount_of_medicine) {
    this.amount_of_medicine = amount_of_medicine;
  }
}
