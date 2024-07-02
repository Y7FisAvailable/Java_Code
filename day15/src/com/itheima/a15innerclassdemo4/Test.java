package com.itheima.a15innerclassdemo4;

public class Test {
    public static void main(String[] args) {
        //调用非静态方法:
        //1.创建静态内部类对象
        //2.对象调用方法
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        //3.调用静态方法
        Outer.Inner.show2();
    }
}
