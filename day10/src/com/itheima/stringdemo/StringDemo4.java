package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String str1 = sc.next();

        //获取字符串长度
        int s = str1.length();

        //遍历长度
        String newStr = "";
        for (int i = 0; i < s; i++) {
            //获取索引下字符
            char chs = str1.charAt(i);
            newStr += chs;
        }
        System.out.println(newStr);
    }
}
