package com.itheima;

public class BF1Test {
    public static void main(String[] args) {
        //创建对象
        BF1 bf1 = new BF1();
        //使用对象，访问属性
        bf1.name = "cary";
        bf1.age = 111;
        bf1.birthday = "0019";
        System.out.println(bf1.name);
        System.out.println(bf1.age);
        System.out.println(bf1.birthday);

        //访问方法
        bf1.study();
        bf1.sleep();
    }
}
