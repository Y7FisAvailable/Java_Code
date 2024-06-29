package com.itheima.a10interfacedemo8;

public class Test {
    public static void main(String[] args) {
        //接口：运输，所以是运输的多态

        //接口多态创建car对象
        YunShu ys1 = new Car("黑车");
        banjia(ys1);

        YunShu ys2 = new Company("AAA");
        banjia(ys2);
    }

    public static void banjia(YunShu ys){//ys对象可以传实现类car、company
        System.out.println("运输中");
        ys.yunshu();
    }
}
