package com.itheima.a08interfacedemo6;

public class InterImpl implements Inter{
    @Override
    public void show0() {
        System.out.println("抽象重写");
    }

    @Override
    public void show1() {
        System.out.println("默认重写");
    }

    public void show2(){
        System.out.println("impl中的show2");
    }
}
