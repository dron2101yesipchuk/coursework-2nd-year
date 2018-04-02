package com.yesipchuk.demo.model;

public class Buyer {
    private Integer id;
    private String PIB;
    private Integer age;

    public Buyer() {
    }

    public Buyer(int ID, String PIB, int age) {
        this.id = ID;
        this.PIB = PIB;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
