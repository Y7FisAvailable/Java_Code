package com.itheima.a10interfacedemo8;

public class Car implements YunShu {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void yunshu() {
        System.out.println(brand + "车在运输");
    }
}
