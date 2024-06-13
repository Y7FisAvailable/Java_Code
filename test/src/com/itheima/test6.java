package com.itheima;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //输入会员等级 0 1
        Scanner sc = new Scanner(System.in);
        System.out.println("输入会员等级：");
        int vip = sc.nextInt();

        //判断会员等级合法
        if(vip != 0 && vip != 1){//判断合法性是”且“
            System.out.println("会员等级有误！");
        }else{

        //输入金额
        System.out.println("输入金额：");
        int money = sc.nextInt();

        if(vip == 0){//普通
            if(money < 100){
                System.out.println("应付" + money);
            }else{
                double money2 = money * 0.9;
                System.out.println("应付" + money2);
            }
        }

        if(vip == 1){//会员
            if(money < 200){
                double money3 = money * 0.8;
                System.out.println("应付" + money3);
            }else {
                double money3 = money * 0.75;
                System.out.println("应付" + money3);
            }
        }
    }//会员等级的合法性
    }
}
