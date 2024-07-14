package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */


        //1.定义开始时间和结束时间、下单时间
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String payment1 = "2023年11月11日 0:01:0";
        String payment2 = "2023年11月11日 0:11:0";
        //2.字符串按照sdf规则解析为date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start1 = sdf.parse(start);
        Date end1 = sdf.parse(end);
        Date payment11 = sdf.parse(payment1);
        Date payment22 = sdf.parse(payment2);
        //3.时间转换为毫秒
        long start1Time = start1.getTime();
        long end1Time = end1.getTime();
        long payment11Time = payment11.getTime();
        long payment22Time = payment22.getTime();

        //4.比较
        if (payment22Time >= start1Time && payment22Time <= end1Time) {
            System.out.println("参加成功！");
        } else {
            System.out.println("参加失败！");
        }


        /*//1.定义字符串表示三个时间
        String startstr = "2023年11月11日 0:0:0";
        String endstr = "2023年11月11日 0:10:0";
        String orderstr = "2023年11月11日 0:01:00";
        //2.解析上面的三个时间，得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date startDate = sdf.parse(startstr);
        Date endDate = sdf.parse(endstr);
        Date orderDate = sdf.parse(orderstr);

        //3.得到三个时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //4.判断
        if (orderTime >= startTime && orderTime <= endTime) {
            System.out.println("参加秒杀活动成功");
        } else {
            System.out.println("参加秒杀活动失败");
        }*/
    }
}
