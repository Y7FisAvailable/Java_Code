package com.itheima.YunSuanFu;

public class SuanShuTest3 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);//11
        System.out.println(b);//10

        int c = 10;
        int d = ++c;
        System.out.println(c);//11
        System.out.println(d);//11
    }
}
