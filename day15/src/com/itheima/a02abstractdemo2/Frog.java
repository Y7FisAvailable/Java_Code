package com.itheima.a02abstractdemo2;

public class Frog extends Animal {
    //不给构造方法，JVM默认给一个空参构造，所以可以setandget
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    //子类Frog重写父类全部的抽象方法后，子类可以创建对象
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
