package com.itheima;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //录入3个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个");
        int num1 = sc.nextInt();
        System.out.println("第二个");
        int num2 = sc.nextInt();
        System.out.println("第三个");
        int num3 = sc.nextInt();

        //假设num1最小
        int min = num1;//3 1 2

        //两两对比，找最小值
        if(min > num2){
            min = num2;
            if(min > num3){
                min = num3;
            }
        }
        //打印结果
        System.out.println("min num" + "为" + min);
    }
}
