package com.itheima.YunSuanFu;

import java.util.Scanner;

public class LuoJiTest1 {
    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = sc.nextInt();

        boolean flag1 = num1 == 6 || num2 == 6;
        boolean flag2 = (num1 + num2) % 6 == 0;
        boolean flag3 = flag1 || flag2;
        System.out.println(flag3);
    }
}
