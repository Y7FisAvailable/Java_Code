package com.itheima;

public class stu {
    //定义学生类

    //私有化成员变量
    private String name;
    private int age;
    //空参构造&有参构造
    public stu() {
    }

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //get and set
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

    //成员方法
}
