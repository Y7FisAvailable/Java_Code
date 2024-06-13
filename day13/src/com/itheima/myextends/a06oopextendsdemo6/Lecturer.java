package com.itheima.myextends.a06oopextendsdemo6;

public class Lecturer extends Teacher{
    //注意继承的父类是哪个？
    //无属性
    //有构造
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    //无g a s
    //有work，需要方法重写
    @Override
    public void work(){
        System.out.println("讲师在上课！");
    }
}
