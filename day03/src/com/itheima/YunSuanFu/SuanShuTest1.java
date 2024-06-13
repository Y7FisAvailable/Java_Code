package com.itheima.YunSuanFu;

import java.util.Scanner;//导包

public class SuanShuTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//调用Scanner类
        //请输入三位整数：
        int num = sc.nextInt();
        System.out.println(num % 10);//3
        System.out.println(num / 10 % 10);//2
        System.out.println(num / 100 % 10);//1
    }
}
