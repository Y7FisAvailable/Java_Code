package com.itheima.a10interfacedemo8;

public class Company implements YunShu {
    private String brand;

    public Company() {
    }

    public Company(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void yunshu() {
        System.out.println(brand + "搬家公司在搬家");
    }
}
