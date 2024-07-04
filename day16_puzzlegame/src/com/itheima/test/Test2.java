package com.itheima.test;

import java.util.Random;

public class Test2 {
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
        //方法二：遍历二维数组,给每个元素赋值
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

        //6.遍历二维数组
        for (int i = 0; i < data.length; i++) {//二维数组的长度就是行
            for (int j = 0; j < data[i].length; j++) {//每行的元素个数
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
