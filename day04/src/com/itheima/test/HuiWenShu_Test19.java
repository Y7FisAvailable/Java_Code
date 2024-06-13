package com.itheima.test;

import java.util.Scanner;

public class HuiWenShu_Test19 {
    public static void main(String[] args) {
        //判断键盘输入文字是否为回文数
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字以判断：");
        int x = sc.nextInt();

        int tempx = x;
        int f = 0;
        //用到循环
        while( x != 0){
            int ge = x % 10;
            f = f * 10 + ge;
            x = x / 10;
        }
        System.out.println(f == tempx);
    }
}
