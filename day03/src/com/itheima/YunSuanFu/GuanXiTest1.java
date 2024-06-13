package com.itheima.YunSuanFu;

import java.util.Scanner;

public class GuanXiTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的时髦度：");
        int ni = sc.nextInt();
        System.out.print("请输入对方时髦度：");
        int ta = sc.nextInt();

         boolean flag = ni > ta;
        System.out.println(flag);
    }
}
