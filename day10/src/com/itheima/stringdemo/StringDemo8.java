package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        int money;

        //合法性校验，0-9999999之间,用了while循环
        while(true){
            System.out.print("请输入金额：");
            money = sc.nextInt();

            if(money >= 0 && money <= 9999999){
                break;//不跳出，则会在此循环检测money的值，而while是死循环，无法终止
            }else{
                System.out.println("输入有误！");
            }
        }
        //2.数字转大写,取出每位
        String moneyStr = "";
        while(true){//2135
            int ge = money % 10;
            String s = Upper(ge);//得到大写
            moneyStr = s + moneyStr;//取数字是5 3 1 2逆向，拼接为正向2135，先拼在后面
            money = money / 10;
            if(money == 0){
                break;//money为0，while循环结束
            }
        }
        //3.补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;//往前面拼零
        }
        //System.out.println(moneyStr);//零零零贰壹叁伍
        //4.补单位
        String[] str = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            //取出字符串下索引的字符！charAt
            char c = moneyStr.charAt(i);
            result = result + c + str[i];//charAt是取出“字符串”中“i”索引元素，“字符串数组str”是不能用str.charAt的！
        }
        System.out.println(result);
        
    }

    //方法，数字转大写
    public static String Upper(int ge){//5
        //定义字符数组：大写汉字表
        String[] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};//数字对应数组的索引
        return str[ge];
    }
}
