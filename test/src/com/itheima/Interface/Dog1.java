package com.itheima.Interface;

public class Dog1 extends Animal1 implements Swim1{
    public Dog1() {
    }

    public Dog1(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗狗刨");
    }
}
