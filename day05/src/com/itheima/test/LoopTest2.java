package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        //键盘录入，求平方根整数部分
        Scanner sc = new Scanner(System.in);
        System.out.println("输入整数");
        int num = sc.nextInt();
        //范围起始：1-num，1*1、2*2...3*3<num但4*4>num，则3是整数部分
        //知道起始用for循环，如果i*i<num继续，如果i*i>num，则i-1是平方根
        for (int i = 1; i <= num; i++) {
            if(i * i == num){
                System.out.println(i + "是平方根");
                break;//找到就停止
            }else if(i * i > num){
                System.out.println(i - 1 + "是平方根");
                break;//找到就停止
            }
        }
    }
}
