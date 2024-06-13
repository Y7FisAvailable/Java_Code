package com.itheima.test;

public class Student {
    //创建成员变量
    private String name;
    private int age;

    //无参构造&有参构造
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get and set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //创建成员方法

}
