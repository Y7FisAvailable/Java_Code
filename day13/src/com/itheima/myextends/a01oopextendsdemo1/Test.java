package com.itheima.myextends.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        //创建对象，调用方法
        BuOu bo = new BuOu();
        bo.eat();
        bo.catchMouse();
        bo.drink();

        System.out.println("-----------------");

        TaiDi td = new TaiDi();
        td.lookHome();
        td.ceng();
    }
}
