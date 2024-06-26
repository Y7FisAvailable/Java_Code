package com.itheima.a03interfacedemo1;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    //抽象类的子类需要重写父类的全部抽象方法，重写保证代码风格、形参统一
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
