package com.itheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        //定义动态数组，长度为10
        int[] arr = new int[10];
        Random r = new Random();

        //生成10个随机数，依次存入数组
        for (int i = 0; i < arr.length; i++) {
            //每次循环重新随机，存入对应数组的元素中
            int number = r.nextInt(100) + 1;//1~100
            arr[i] = number;
            System.out.print(arr[i] + " ");
        }

        //遍历数组求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和为："+ sum);

        //求和结果除以个数 = 平均数
        double average = (double)(sum / arr.length);
        System.out.println("平均数为："+ average);

        //统计有几个元素比平均值小？
        //定义计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < average){
                count++;//元素小于平均值，计数器+1
            }
        }
        System.out.println("有"+ count + "个数据比平均值小");
    }
}
