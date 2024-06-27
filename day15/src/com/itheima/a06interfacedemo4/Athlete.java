package com.itheima.a06interfacedemo4;

public abstract class Athlete extends Person{//运动员父类
    //构造方法
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    //学习方法，抽象方法
    public abstract void study();
}
