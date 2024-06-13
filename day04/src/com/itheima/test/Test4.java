package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //键盘录入票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号：");
        int num = sc.nextInt();
        //判断票号合法性
        if(num > 0 && num <= 100) {
            //判断奇偶
            if (num % 2 == 1) {
                System.out.println("zuo");
            } else {
                System.out.println("you");
            }
        }
    }
}
