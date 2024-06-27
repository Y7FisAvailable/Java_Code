package com.itheima.a07interfacedemo5;

public interface Inter {
    public abstract void method();

    public default void show(){
        System.out.println("默认方法——show");
    }
}
