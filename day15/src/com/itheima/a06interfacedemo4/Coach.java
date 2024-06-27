package com.itheima.a06interfacedemo4;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    //教，抽象方法
    public abstract void teach();
}
