package com.itheima.myextends.a06oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
        //创建四个对象
        Lecturer l = new Lecturer("jiangshi001", "张老师");
        System.out.println(l.getId() + "," + l.getName());
        l.work();

        System.out.println("---------------");

        Tutor t = new Tutor();
        t.setId("zhujiao002");
        t.setName("李助教");
        System.out.println(t.getId() + "," + t.getName());
        t.work();

        System.out.println("---------------");

        Maintainer m = new Maintainer("weihu003","维护员");
        System.out.println(m.getId() + "," + m.getName());
        m.work();

        System.out.println("---------------");

        Buyer b = new Buyer("caigou004","采购员");
        System.out.println(b.getId() + "," + b.getName());
        b.work();

    }
}
