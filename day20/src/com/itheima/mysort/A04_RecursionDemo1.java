package com.itheima.mysort;

public class A04_RecursionDemo1 {
    public static void main(String[] args) {

        //直接内存溢出
        method();
    }

    public static void method(){
        method();
    }
}
