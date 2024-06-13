package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str1 = sc.next();

        //2.创建StringBuilder对象，放入字符串
        StringBuilder sb = new StringBuilder(str1);
        //3.反转sb对象
        sb.reverse();
        //4.toString
        String str2 = sb.toString();

        //直接链式编程：反转 toString
        String result = new StringBuilder(str1).reverse().toString();

        //5.用equals比较
        if(str1.equals(result)){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}
