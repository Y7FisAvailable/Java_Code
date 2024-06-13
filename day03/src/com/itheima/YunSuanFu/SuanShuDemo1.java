package com.itheima.YunSuanFu;

public class SuanShuDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(2 + 3);//5
        //-
        System.out.println(3 - 1);//2
        //*
        System.out.println(2 * 3);//6

        //计算中有小数参与
        //结论：有可能计算结果不精确
        //原因：SE进阶详细讲，只需要知道结论
        System.out.println(1.1 + 1.1);//2.2
        System.out.println(1.1 + 1.01);//2.1100000000000003
    }
}
