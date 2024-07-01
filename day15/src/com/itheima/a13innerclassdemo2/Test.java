package com.itheima.a13innerclassdemo2;

public class Test {
    public static void main(String[] args) {
        //创建外部类对象
        Outer o = new Outer();

        //调用外部类方法
        //方法1：
        //因为Inner私有，所以不能Outer.Inner
        //私有后，外界不知道Outer中有Inner这个成员内部类
        //Outer.Inner inner = o.getInner();
        //于是用Inner的父类类型Object，形成多态
        //多态：1.继承关系 2.F f = new Z 3.方法重写
        Object inner = o.getInner();
        System.out.println(inner);

        //方法2：
        //直接使用，方法获取到的对象
        System.out.println(o.getInner());

    }
}
