package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A04_SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /*
            假设，你初恋的出生年月日为:2000-11-11
            请用字符串表示这个数据，并将其转换为:2000年11月11日

            创建一个Date对象表示2000年11月11日
            创建一个SimpleDateFormat对象，并定义格式为年月日把时间变成:2000年11月11日
        */

        //1.创建字符串
        String str = "2000-11-19";
        //2.创建sdf对象，设置指定格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //3.用sdf格式调用parse方法，传入str对象，将字符串【解析】为date对象
        Date date = sdf1.parse(str);
        //System.out.println(date);//Sun Nov 19 00:00:00 CST 2000
        //4.date对象设置指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        //5.格式调用格式化方法将date对象【格式化】为字符串，并打印
        String s = sdf2.format(date);
        System.out.println(s);//2000年11月19日

        //链式编程的稀碎可读性
        //System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(new SimpleDateFormat("yyyy-MM-dd").parse("2000-11-19")));


        /*//1.可以通过2000-11-11进行解析，解析成一个Date对象
        String str = "2000-11-11";
        //2.解析
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);
        //3.格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);*/
    }
}
