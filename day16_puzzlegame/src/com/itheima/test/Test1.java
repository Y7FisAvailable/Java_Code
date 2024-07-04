package com.itheima.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //1.创建一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2.获取随机索引
        Random r = new Random();

        for (int i = 0; i < tempArr.length; i++) {
            int randomIndex = r.nextInt(16);//0-15
            //以下代码可能会让某个元素重复出现
            //tempArr[i] = tempArr[randomIndex];

            int temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }
        //3.遍历一维数组
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();

        //4.创建二维数组
        int[][] data = new int[4][4];

        //5.给二维数组添加数据
        //方法一：遍历一维数组
        for (int i = 0; i < tempArr.length; i++) {
            //i = 0
            //0 / 4 = 0，0 % 4 = 0 -> data[0][0]
            //i = 1
            //1 / 4 = 0，1 % 4 = 1 -> data[0][1]
            data[i / 4][i % 4] = tempArr[i];
        }
        //6.遍历二维数组
        for (int i = 0; i < data.length; i++) {//二维数组的长度是4
            for (int j = 0; j < data[i].length; j++) {//二维数组中每个一维数组的长度也是4
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
