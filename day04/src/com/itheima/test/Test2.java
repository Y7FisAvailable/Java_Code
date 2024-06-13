package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱：");
        int money = sc.nextInt();
        //判断是否大于100
        if(money > 100){
            System.out.println("wanghong");
        }else{
            System.out.println("shaxian");
        }
    }
}
