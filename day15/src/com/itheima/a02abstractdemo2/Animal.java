package com.itheima.a02abstractdemo2;

public abstract class Animal {//抽象类
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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

    //成员方法
    public void drink(){
        System.out.println("动物在喝水");
    }
    //抽象方法
    public abstract void eat();
}
