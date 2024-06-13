package com.itheima.test3;

public class Cars {
    //成员变量
    private String brand;
    private double price;
    private String color;

    //无参构造和有参构造
    public Cars() {
    }

    public Cars(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //set和get

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //成员方法
}
