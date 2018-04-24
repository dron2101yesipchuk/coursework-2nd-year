package com.yesipchuk.demo.modelJDBC;

public class Buyer {
  private Long id;
  private String pib;
  private Long age;

    public Buyer(Long id, String pib, Long age) {
        this.id = id;
        this.pib = pib;
        this.age = age;
    }

    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPib() {
    return pib;
  }

  public void setPib(String pib) {
    this.pib = pib;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }
}
