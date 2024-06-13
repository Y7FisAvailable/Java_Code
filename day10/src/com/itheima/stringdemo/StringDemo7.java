package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();

        String result = change(str);
        System.out.println(result);

    }
    //定义方法， 反转字符串——字符串反转？不就是反向相加吗！
    public static String change(String str){//abc
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
