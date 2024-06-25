package com.itheima.a01abstractdemo1;

public abstract class Person {//抽象类
    private String name;
    private int age;

    //构造方法
    //目的：抽象类person抽取了两个子类中的共有属性，当子类Student
    //准备创建对象给name和age赋值时，会用到父类的构造方法赋值
    public Person() {
    }

    public Person(String name, int age) {
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

    //抽象方法
    //抽象方法不能确定具体方法体内容，故无方法体
    public abstract void sleep();
}
