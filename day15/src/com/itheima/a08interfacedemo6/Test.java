package com.itheima.a08interfacedemo6;

public class Test {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show0();
        ii.show1();

        Inter.show2();//接口名.静态方法
    }
}
