package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入支付钱数：");
        int pay = sc.nextInt();
        //判断是否大于600，大于付款成，小于付款失败
        if(pay > 600){
            System.out.println("支付成功！");
        }else{
            System.out.println("支付失败！");
        }
    }
}
