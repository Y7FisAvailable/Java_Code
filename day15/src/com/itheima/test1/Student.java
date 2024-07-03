package com.itheima.test1;

public class Student {
    private String name;
    private int age;

    {
        System.out.println("构造代码块！");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
