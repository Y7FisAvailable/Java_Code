package com.itheima.test2;

public class Student {
    private String name;
    private int age;

    public Student() {
        this(null,0);
    }

    public Student(String name, int age) {
        System.out.println("开始创建对象1");
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        System.out.println("开始创建对象2");
        this.name = name;
    }

    public Student(int age) {
        System.out.println("开始创建对象3");
        this.age = age;
    }
}
