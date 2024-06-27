package com.itheima.a06interfacedemo4;

public class LanQiuer extends Athlete{
    public LanQiuer() {
    }

    public LanQiuer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
