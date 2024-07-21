package com.itheima.Interface;

public abstract class Animal1 {//父类
    private String name;
    private int age;

    public Animal1() {
    }

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    //子类抽取的方法，不知道结构体些什么，定义为抽象方法
    public abstract void eat();
}
