package com.itheima.test;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("call----");
        int num = sc.nextInt();
        switch(num){
            case 1 -> System.out.println("查询");
            case 2 -> System.out.println("预定");
            case 3 -> System.out.println("改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
