package com.itheima.a06interfacedemo4;

public class LanQiuCoach extends Coach{
    public LanQiuCoach() {
    }

    public LanQiuCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }
}
