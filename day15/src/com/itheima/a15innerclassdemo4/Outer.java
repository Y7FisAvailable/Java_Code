package com.itheima.a15innerclassdemo4;

public class Outer {//外部类
    int a = 10;
    static int b = 20;

    static class Inner {//静态内部类
        public void show1(){//普通成员方法
            System.out.println("内部类的普通方法show1");

            //调用外部类的静态变量a:
            //1.创建外部类对象
            //2.对象调用
            Outer o = new Outer();
            System.out.println(o.a);//a是静态，不能直接调用
            System.out.println(b);//b非静态，直接调用

        }
        static void show2(){//静态方法
            System.out.println("内部类的静态方法show2");

            //调用外部类的静态变量a:
            //1.创建外部类对象
            //2.对象调用
            Outer o = new Outer();
            System.out.println(o.a);//a是静态，不能直接调用
            System.out.println(b);//b非静态，直接调用
        }
    }
}
