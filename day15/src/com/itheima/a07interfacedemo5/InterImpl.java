package com.itheima.a07interfacedemo5;

public class InterImpl implements Inter,Inter2{
    //实现类只重写接口的抽象方法
    @Override
    public void method() {
        System.out.println("抽象方法被重写");
    }

    //如果要重写默认方法，直接手动添加并去掉default关键字
    @Override
    public void show() {
        //Inter.super.show();
        System.out.println("默认方法被重写");
    }
}
