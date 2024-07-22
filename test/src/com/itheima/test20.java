package com.itheima;

public class test20 {
    public static void main(String[] args) {
        /*
            选择排序：
                1，从0索引开始，跟后面的元素一一比较。
                2，小的放前面，大的放后面。
                3，第一次循环结束后，最小的数据已经确定。
                4，第二次循环从1索引开始以此类推。

         */


        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //最终代码
        //外循环：轮数：要拿着哪个索引上的元素跟其他元素比较？
        for (int i = 0; i < arr.length - 1; i++) {//i = 0 1 2 3，n个元素比n—1轮

            //内循环：第一次循环
            for (int j = i + 1; j < arr.length; j++) {//j的范围是1 2 3 4
                //i:拿哪个元素比？
                //j:被比较的元素，也就是i后面的元素
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
