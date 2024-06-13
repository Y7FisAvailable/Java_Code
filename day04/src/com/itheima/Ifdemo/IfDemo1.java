package com.itheima.Ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //if格式1
        //键盘录入酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入酒量：");
        int wine = sc.nextInt();

        //判断酒量
        if(wine > 2){
            System.out.println("小伙子，不错！");
        }
    }
}
