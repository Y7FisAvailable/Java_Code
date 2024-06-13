package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test4_DaLuan {
    public static void main(String[] args) {
        //键盘录入字符串，打乱
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //2.打乱字符串？字符串->字符数组，打乱索引用Random
        char[] chs = str.toCharArray();
        Random r = new Random();//随机
        for (int i = 0; i < str.length(); i++) {
            int number = r.nextInt(str.length());//范围：字符串长度0~?
            //System.out.println("随机为" + number);
            chs[i] = chs[number];
            //System.out.println(chs[i]);
        }
        //3.字符数组->字符串
        String result = new String(chs);
        String result2 = chs.toString();//注意：toString方法用于将StringBuilder对象转为String,chs.toString是地址值
        System.out.println(result);
        System.out.println(result2);//[C@6e8cf4c6
    }
}
