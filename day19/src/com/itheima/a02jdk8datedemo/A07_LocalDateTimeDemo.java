package com.itheima.a02jdk8datedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A07_LocalDateTimeDemo {
    public static void main(String[] args) {
        // 当前时间的的日历对象(包含年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2024, 7, 15, 18, 45, 11);

        System.out.println("今天是:" + nowDateTime);//今天是：2024-07-15T18:31:36.379434600
        System.out.println(nowDateTime.getYear());//年
        System.out.println(nowDateTime.getMonthValue());//月
        System.out.println(nowDateTime.getDayOfMonth());//日
        System.out.println(nowDateTime.getHour());//时
        System.out.println(nowDateTime.getMinute());//分
        System.out.println(nowDateTime.getSecond());//秒
        System.out.println(nowDateTime.getNano());//纳秒


        //日:当年的第几天
        System.out.println("DayofYear:" + nowDateTime.getDayOfYear());//DayofYear:197
        //星期 sunday--7   monday--1 ... saturday--6
        System.out.println(nowDateTime.getDayOfWeek());//MONDAY
        System.out.println(nowDateTime.getDayOfWeek().getValue());//1
        //月份
        System.out.println(nowDateTime.getMonth());//JULY
        System.out.println(nowDateTime.getMonth().getValue());//7

        //nowDateTime:2024-07-15T18:50:01.853513
        //LocalDate:2024-07-15
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        //nowDateTime:2024-07-15T18:50:01.853513
        //LocalTime:18:51:51.497694700
        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
         System.out.println(lt.getSecond());
    }
}
