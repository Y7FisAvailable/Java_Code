package com.itheima;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //输入金额，限制大于1000
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本金，1000起存");
        int money = sc.nextInt();
        //输入年限，1，2，3，5
        System.out.println("请输入年限，1235");
        int year = sc.nextInt();

        //判断输入合法性
        if(money >= 1000 && year == 1){
            money += money * 0.0225 * year;
        }else if(money >= 1000 && year == 2){
            money += money * 0.027 * year;
        }else if(money >= 1000 && year == 3){
            money += money * 0.0325 * year;
        }else if(money >= 1000 && year == 5){
            money += money * 0.036 * year;
        }
        System.out.println(money);
    }
}
