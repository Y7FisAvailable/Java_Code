package com.itheima.a08interfacedemo6;

public interface Inter {
    public abstract void show0();

    public default void show1(){
        System.out.println("默认方法show1");
    }

    public static void show2(){
        System.out.println("静态方法show2");
    }
}
