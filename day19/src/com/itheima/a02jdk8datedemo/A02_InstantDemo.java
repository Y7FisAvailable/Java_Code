package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneId zone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */
        //1.获取当前时间的Instant对象(标准时间)      [纳秒形式]
        Instant now = Instant.now();
        System.out.println(now);//2024-07-15T04:52:26.688963200Z

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        //[milli毫秒]
        //Instant instant1 = Instant.ofEpochMilli(0L);//1970-01-01T00:00:00z
        Instant instant1 = Instant.ofEpochMilli(1L);//1970-01-01T00:00:00.001Z
        System.out.println("毫秒：" +instant1);

        //[s秒]
        //Instant instant2 = Instant.ofEpochSecond(0L);//1970-01-01T00:00:00Z
        Instant instant2 = Instant.ofEpochSecond(1L);//1970-01-01T00:00:01Z
        System.out.println("秒：" +instant2);

        //[nano纳秒]
        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);//1s+1000000000nano=2s
        System.out.println("纳秒：" +instant3);//纳秒：1970-01-01T00:00:02Z

        //3. 指定时区
        System.out.println(Instant.now());//2024-07-15T06:24:16.516190300Z
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));//2024-07-15T14:24:16.516190300+08:00[Asia/Shanghai]
        System.out.println(time);

        //4.isXxx 判断
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5 =Instant.ofEpochMilli(1000L);

        //5.用于时间的判断
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面
        boolean result1=instant4.isBefore(instant5);//4在5前面吗？
        System.out.println(result1);//true

        //isAfter:判断调用者代表的时间是否在参数表示时间的后面
        boolean result2 = instant4.isAfter(instant5);//4在5后面吗？
        System.out.println(result2);//false

        //6.Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        Instant instant6 =Instant.ofEpochMilli(3000L);
        System.out.println(instant6);//1970-01-01T00:00:03Z

        Instant instant7 =instant6.minusSeconds(1);
        System.out.println(instant7);//1970-01-01T00:00:02Z
    }
}
