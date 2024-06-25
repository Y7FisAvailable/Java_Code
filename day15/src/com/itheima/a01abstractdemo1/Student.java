package com.itheima.a01abstractdemo1;

public class Student extends Person {

    //重写抽象父类的全部抽象方法
    @Override
    public void sleep() {
        System.out.println("学生在睡觉！");
    }
}
