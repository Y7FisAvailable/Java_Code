package com.itheima;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class test15 {
    public static void main(String[] args) {
        //1.获取当前时间的Instant对象
        //这是纳秒形式
        System.out.println(Instant.now());//2024-07-15T06:27:53.490832500Z

        //2.根据秒 毫秒 纳秒获取Instant对象
        //毫秒
        Instant instant1 = Instant.ofEpochMilli(1L);
        System.out.println(instant1);//1970-01-01T00:00:00.001Z

        //秒
        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);//1970-01-01T00:00:01Z

        //纳秒
        Instant instant3 = Instant.ofEpochSecond(0L, 1000000000l);
        System.out.println(instant3);//1970-01-01T00:00:01Z

        //3.指定时区
        System.out.println(Instant.now());
        //ZoneId.of("Asia/Shanghai")时区对象
        //当前时间    在指定时区        亚洲/上海
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

    }
}
