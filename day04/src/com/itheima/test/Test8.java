package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //键盘录入时间
        Scanner sc = new Scanner(System.in);
        System.out.println("输入日期");
        int day = sc.nextInt();
        //判断条件
        switch(day){
            case 1:
                System.out.println("跑步");break;
            case 2:
                System.out.println("游泳");break;
            case 3:
                System.out.println("慢走");break;
            case 4:
                System.out.println("动感单车");break;
            case 5:
                System.out.println("拳击");break;
            case 6:
                System.out.println("爬山");break;
            case 7:
                System.out.println("好好吃一顿");break;
            default:
                System.out.println("没有这个日期！");break;
        }
    }
}
