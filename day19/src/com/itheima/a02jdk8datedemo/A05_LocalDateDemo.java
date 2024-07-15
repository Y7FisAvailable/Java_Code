package com.itheima.a02jdk8datedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期:" + nowDate);
        //2.获取指定的时间的日历对象
        LocalDate ldDate = LocalDate.of(2023, 2,22);
        System.out.println("指定日期:" + ldDate);

        System.out.println("=============================");

        //3.get系列方法获取日历中的每一个属性值
        //获取年
        int year = ldDate.getYear();
        System.out.println("year: " + year);//2023

        //获取月
        //方式一://注意对象的类型是Month
        Month m = ldDate.getMonth();
        System.out.println(m);//FEBRUARY
        System.out.println(m.getValue());//FEBRUARY被getValue，的值是1

        //方式二:/注意对象的类型是int
        int month = ldDate.getMonthValue();
        System.out.println("month: " + month);//2

        //获取日
        int day = ldDate.getDayOfMonth();
        System.out.println("day:" + day);//一个月中的第22天

        //获取一年的第几天
        int dayofYear = ldDate.getDayOfYear();
        System.out.println("dayOfYear:" + dayofYear);//一年中的第53天

        //获取星期：注意对象的类型为DayOfWeek
        DayOfWeek dayOfWeek = ldDate.getDayOfWeek();
        System.out.println(dayOfWeek);//WEDNESDAY
        System.out.println(dayOfWeek.getValue());//3

        //is开头的方法表示判断
        System.out.println(ldDate.isBefore(ldDate));//当前时间在当前时间前？false
        System.out.println(ldDate.isAfter(ldDate));//当前时间在当前时间后？false

        //with开头的方法表示修改，只能修改年月日
        LocalDate withLocalDate = ldDate.withYear(2000);
        System.out.println(withLocalDate);//2000-02-22

        //minus开头的方法表示减少，只能减少年月日
        LocalDate minusLocalDate = ldDate.minusYears(1);//对于ldDate的year：2023 - 1
        System.out.println(minusLocalDate);//2022-02-22


        //plus开头的方法表示增加，只能增加年月日
        LocalDate plusLocalDate = ldDate.plusDays(3);//对于ldDate的day：22 + 3
        System.out.println(plusLocalDate);//2023-02-25

        //-------------
        // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2000, 7, 15);//你的生日
        LocalDate nowDate1 = LocalDate.now();//当前时间
        System.out.println(nowDate1);//2024-07-15

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());//MonthDay方法封装生日的月、日
        MonthDay nowMd = MonthDay.from(nowDate1);//MonthDay从LocalDate对象中取出月、日
        System.out.println(birMd);//--07-15
        System.out.println(nowMd);//--07-15

        System.out.println("今天是你的生日吗? " + birMd.equals(nowMd));//今天是你的生日吗?
    }
}
