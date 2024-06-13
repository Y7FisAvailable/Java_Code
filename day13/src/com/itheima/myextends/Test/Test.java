package com.itheima.myextends.Test;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.age = 11;//age被继承了，直接对象名.成员变量
        z.setName("张三");//name没被继承，不能直接用
        System.out.println(z.age +"," +z.getName());
    }
}
