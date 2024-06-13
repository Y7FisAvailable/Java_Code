package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //给出一个身份证号码
        String idNumber = "610104199807145717";

        String year = idNumber.substring(6,10);//6索引-9索引，不含10
        String month = idNumber.substring(10,12);
        String day = idNumber.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println("出生年月日："+ year + "年" + month + "月" + day + "日");

        //取出字符串中的性别索引
        //String s = idNumber.substring(0,1);//取出单个索引方法1
        char c = idNumber.charAt(16);
        //System.out.println(c);//取出了字符型数字

        //字符型数字 -> 数字
        int gender = c - 48;//ascii中，48是字符0
        if(gender % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }
        //System.out.println('0' + 0);//char类型进行运算时，查ascii，拿对应数字运算

    }
}
