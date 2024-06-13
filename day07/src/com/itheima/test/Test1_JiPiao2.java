package com.itheima.test;

import java.util.Scanner;

public class Test1_JiPiao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入原价");
        double money = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();
        System.out.println("输入舱型 0头等 1经济");
        int type = sc.nextInt();

        if(month >= 5 && month <= 10){
            //旺季
            money = endPrice(money,type,0.9,0.85);
        }else if((month >= 11 && month <= 12)||(month >= 1 && month <= 4)){
            //淡季
            money = endPrice(money,type,0.7,0.65);
        }else{
            System.out.println("月份有误");
        }
        System.out.println(money);
    }
    //定义方法，通过原价，舱型，头等舱折扣，经济舱折扣，确定价格
    public static double endPrice(double money,int type,double v1,double v2){
        if(type == 0){
            money = money * v1;
        }else if(type == 1){
            money = money * v2;
        }else{
            System.out.println("舱型有误");
        }
        return money;
    }
}
