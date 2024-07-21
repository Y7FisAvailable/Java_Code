package com.itheima.Interface;

public class Rabbit1 extends Animal1 {
    public Rabbit1() {
    }

    public Rabbit1(String name, int age) {
        super(name, age);
    }

    //抽象父类的子类需要重写父类的全部抽象方法
    //或者子类也得是一个抽象类
    @Override
    public void eat() {
        System.out.println("兔兔吃胡萝卜");
    }
}
