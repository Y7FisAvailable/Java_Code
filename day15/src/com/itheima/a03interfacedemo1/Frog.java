package com.itheima.a03interfacedemo1;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    //抽象类的子类
    //1.重写父类中所有抽象方法
    //2.子类也得是抽象类
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }


}
