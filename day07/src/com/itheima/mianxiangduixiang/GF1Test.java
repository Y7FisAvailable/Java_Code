package com.itheima.mianxiangduixiang;

public class GF1Test {
    public static void main(String[] args) {
        //创建对象：类名 对象名 = new 类名();
        GF1 gf1 = new GF1();

        //使用对象：对象名.成员变量
        gf1.setName("s");
        gf1.setAge(18);
        gf1.setSex('n');
        System.out.println(gf1.getName());
        System.out.println(gf1.getSex());
        System.out.println(gf1.getAge());

        //变量名.成员方法
        gf1.eat();
        gf1.sleep();
    }
}
