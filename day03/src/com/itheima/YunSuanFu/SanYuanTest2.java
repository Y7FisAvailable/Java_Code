package com.itheima.YunSuanFu;

public class SanYuanTest2 {
    public static void main(String[] args) {
        int h1 = 150;
        int h2 = 165;
        int h3 = 210;

        //两两相比较
        int temp = h1 > h2 ? h1 : h2;
        int max = temp > h3 ? temp : h3;
        System.out.println(max);
    }
}