package com.itheima.myextends.a05oopextendsdemo5;

public class YuanGong {
    private String id;
    private String name;
    private double salary;

    public YuanGong() {
    }

    public YuanGong(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工正在工作！");
    }

    public void eat(){
        System.out.println("吃米饭！");
    }
}
