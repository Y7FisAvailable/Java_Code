package com.itheima.mysort;

public class A01_BubbleDemo_2 {
    public static void main(String[] args) {
        /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的放右边，小的放左边。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        */


        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //循环一轮：数组长度：5，索引范围：0-4，交换4次，得到最大值5
        //循环两轮：数组长度:5-1,索引范围：0-3，交换3次，得到次大值4
        //循环三轮：数组长度：5-1-1，索引范围：0-2，交换2次，得到3
        // ...
        //N个数据只需要循环N-1轮

        //外循环————轮数
        for (int i = 0; i < arr.length - 1; i++) {//长度为5，最大循环次数为4，索引的话就是0-3

            //内循环————一轮
            for (int j = 0; j < arr.length - 1 - i; j++) {//外循环每循环一次，右侧确定一个最大值，该值不参与下轮交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //遍历arr
            printArr(arr);
        }



    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
