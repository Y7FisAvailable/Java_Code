package com.itheima.a04test;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        //parseInt 字符串转int
        int sum = 0;
        int number = 0;
        //1.定义字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();//145
        int l = str.length() - 1;
        //System.out.println(str.length());

        //2.定义字符串规则
        boolean matches = str.matches("[1-9]\\d{0,9}");
        if (!matches) {
            System.out.println("输入有误！");
        } else {
            //System.out.println(matches);
            //3.取出字符串每个元素？
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);//'1'---49 '4' '5'
                //System.out.println(c);
                //4.字符转数字
                int cNumber = (int) (c - '0');//获得int类型的数字 1 2 3
                //System.out.println(cNumber);

                //5.获取字符串长度，获取每位数字，进位
                cNumber = cNumber * (int) (Math.pow(10, l));//100
                l--;
                sum += cNumber;
            }
            System.out.println(sum + 1);
        }
    }
}
