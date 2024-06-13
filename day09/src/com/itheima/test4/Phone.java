package com.itheima.test4;

public class Phone {
    //成员属性
    private String brand;
    private double price;
    private String color;

    //无参构造初始化
    public Phone() {
    }

    //有参构造初始化
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //set和get方法

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
