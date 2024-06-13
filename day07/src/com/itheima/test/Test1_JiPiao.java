package com.itheima.test;

import java.util.Scanner;

public class Test1_JiPiao {
    public static void main(String[] args) {
        //输入原价、月份、头等舱0经济舱1
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入原价：");//1000
        double money = sc.nextInt();
        System.out.print("请输入月份：");//5
        double month = sc.nextInt();
        System.out.print("请输入舱型（0头等/1经济）：");//0
        double type = sc.nextInt();

        if(month >= 5 && month <= 10){//旺季
            if(type == 0){//旺季头等
                money *= 0.9;
                //System.out.println("您的价格是：" + money);
            }else if(type == 1){//旺季经济
                money *= 0.85;
                //System.out.println("您的价格是：" + money);
            }else{
                System.out.println("您输入的舱型" + type +"有误!");
            }
        }else if((month >= 11 && month <= 12)||(month >= 1 && month <=4)){//淡季
            if(type == 0){//淡季头等
                money *= 0.7;
                //System.out.println("您的价格是：" + money);
            }else if(type == 1){//淡季经济
                money *= 0.65;
                //System.out.println("您的价格是：" + money);
            }else{
                System.out.println("您输入的舱型" + type +"有误!");
            }
        }else{
            System.out.println("您输入的月份有误！");
        }
        //输出价格
        System.out.println("您的价格是：" + money);
        //旺季5-10：头等舱9折，经济舱8.5
        //淡季11-来年4：头等舱7，经济舱6.5
    }
}
