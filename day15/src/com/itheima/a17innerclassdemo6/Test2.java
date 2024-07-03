package com.itheima.a17innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        /*
        *    new 类/接口() {
        *        方法重写
        *    };
        */

        //创建出来的是匿名内部类的对象
        //是Swim接口的实现类对象
        //所以可以 对象赋值给Swim类型的对象，形成接口多态
        Swim s = new Swim(){

            @Override
            public void swim() {
                System.out.println("游泳的test2的方法重写");
            }
        };
        s.swim();//接口多态调用方法：编译看左边，运行看右边



        new Swim(){

            @Override
            public void swim() {
                System.out.println("游泳的二次重写");
            }
        }.swim();
        //为什么匿名内部类能直接调用方法？
        //  匿名内部类其实是匿名内部类对象，
        //  这个对象是由后面大括号内的无名类所创建的，
        //  所以对象可以调用自己类里全部的方法

    }
}
