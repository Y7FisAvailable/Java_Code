package com.itheima.Interface;

public class Frog1 extends Animal1 implements Swim1{
    public Frog1() {
    }

    public Frog1(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙蛙泳");
    }
}
