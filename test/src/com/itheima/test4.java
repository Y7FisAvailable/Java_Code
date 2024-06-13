package com.itheima;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //输入三个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个");
        int num1 = sc.nextInt();
        System.out.println("请输入第一个");
        int num2 = sc.nextInt();
        System.out.println("请输入第一个");
        int num3 = sc.nextInt();

        int temp = num1 < num2 ? num1 : num2;
        int min = temp < num3 ? temp : num3;
        System.out.println("最小值为" + min);
    }
}
