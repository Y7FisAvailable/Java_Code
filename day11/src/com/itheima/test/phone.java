package com.itheima.test;

public class phone {
    //成员变量-属性
    private String brand;
    private double price;
    //空参有参
    public phone() {
    }

    public phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    //get and set
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //成员方法-行为
}
