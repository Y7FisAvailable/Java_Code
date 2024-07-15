package com.itheima.a02jdk8datedemo;

import java.time.LocalTime;

public class A06_LocalTimeDemo {
    public static void main(String[] args) {
        // 获取本地时间的日历对象。(包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间:" + nowTime);//18:25:32.915928600

        int hour = nowTime.getHour();//取出小时
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();//取出分钟
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();//取出秒
        System.out.println("second:" + second);

        int nano = nowTime.getNano();//取出纳秒
        System.out.println("nano:" + nano);

        System.out.println("------------------------------------");

        //LocalTime.of 获取指定时间对象。
        System.out.println(LocalTime.of(8, 20));//时分
        System.out.println(LocalTime.of(8, 20, 30));//时分秒
        System.out.println(LocalTime.of(8, 20, 30, 150));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

        //is系列的方法
        //isBefore    isAfter
        System.out.println(nowTime.isBefore(mTime));//18:28:32.693468800在08:20:30.000000150之前吗？false
        System.out.println(nowTime.isAfter(mTime));

        //with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10));//18 - 10 = 10:28:32.693468800

        //plus系列的方法，只能修改时、分、秒
        System.out.println(nowTime.plusHours(10));//18 + 10 = 04:28:32.693468800




    }
}
