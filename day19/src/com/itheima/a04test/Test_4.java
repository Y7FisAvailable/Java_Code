package com.itheima.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test_4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //7
        //1.生日时间
        String str1 = "1998/7/14";
        //2.格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(str1);
        long str1Time = date.getTime();
        //2.现在时间
        long todayTime = System.currentTimeMillis();
        //3.间隔
        long time = todayTime - str1Time;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //8
        LocalDate ld1 = LocalDate.of(1998,7,14);
        LocalDate ld2 = LocalDate.now();
        long between = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(between);

    }
}
