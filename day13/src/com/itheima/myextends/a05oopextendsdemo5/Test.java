package com.itheima.myextends.a05oopextendsdemo5;

public class Test {
    public static void main(String[] args) {
        //有参构造对象j
        JingLi j = new JingLi("heima001", "张三", 15000, 5000);
        System.out.println(j.getId() + "," + j.getName() + "," + j.getSalary() + "," + j.getBouns());
        j.work();
        j.eat();

        //无参构造对象c
        ChuShi c = new ChuShi();
        c.setId("heima999");
        c.setName("李四");
        c.setSalary(10000);
        System.out.println(c.getId() + "," + c.getName() + "," + c.getSalary());
        c.work();
        c.eat();
    }
}
