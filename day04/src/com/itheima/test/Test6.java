package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //定义商品总价
        int good = 1000;
        //键盘输入会员等级
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的会员等级");
        int vip = sc.nextInt();
        //校验会员等级范围
        if(vip >= 1 && vip <= 3 ){
            //判断折扣
            if(vip == 1){
                System.out.println("尊敬的"+ vip + "级会员，总价为：" + good*0.9);
            }else if(vip == 2){
                System.out.println("尊敬的"+ vip + "级会员，总价为：" + good*0.8);
            }else{
                System.out.println("尊敬的"+ vip + "级会员，总价为：" + good*0.7);
            }
        }else{
            System.out.println("非会员，总价为：" + good);
        }
    }
}
