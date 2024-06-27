package com.itheima.a09interfacedemo7;

public interface Inter {
    public default void start(){
        System.out.println("start");
        log();
    }

    public default void end(){
        System.out.println("end");
        log();
    }

    public static void log(){
        System.out.println("log");
    }
}
