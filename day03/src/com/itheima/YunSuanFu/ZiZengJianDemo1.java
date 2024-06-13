package com.itheima.YunSuanFu;

public class ZiZengJianDemo1 {
    public static void main(String[] args) {
        //+=
        int a = 10;
        int b = 20;
        a += b;
        //等同于：a = (int)(a + b)
        System.out.println(a);//30
        System.out.println(b);//20

        //细节：
        //在+=，-=，*=，/=中，都隐藏了一个强制类型转换
        short s = 1;
        //short + int,short强转为int
        //然后相加，结果赋值给short类型的s
        s += 1;
        //等同于：s = (short)(s + 1);
        System.out.println(s);//2
    }
}
