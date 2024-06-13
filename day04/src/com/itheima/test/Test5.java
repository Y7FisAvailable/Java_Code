package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //键盘输入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        int score = sc.nextInt();
        //判断成绩合法0~100
        if(score >= 0 && score <= 100){
            //判断成绩在哪个区间
            if(score >= 95){
                System.out.println("自行车");
            }else if(score >= 90){
                System.out.println("游乐园");
            }else if(score >= 80){
                System.out.println("变形金刚");
            }else{
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("非法输入");
        }
    }
}
