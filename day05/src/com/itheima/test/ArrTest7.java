package com.itheima.test;

import java.util.Random;

public class ArrTest7 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5};

        //随机数
        Random r = new Random();

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //生成随机数,范围是数组长度5，范围就是0-4
            int randomIndex = r.nextInt(arr.length);
            //定义临时变量,arr[i]的值和arr[r]交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //最后循环结束，打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
