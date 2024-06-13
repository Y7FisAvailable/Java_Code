package com.itheima.myextends.a06oopextendsdemo6;

public class Teacher extends Employee {
    //无成员变量

    //得有构造方法，因为无法继承
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    //无get and set
}
