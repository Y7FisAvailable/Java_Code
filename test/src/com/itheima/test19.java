package com.itheima;

public class test19 {
    public static void main(String[] args) {
        /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的左边放右边，小的放。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        */


        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};


        //循环控制轮数
        //每往后一轮，比上轮循环少一次
        //第一轮：循环4次
        //第二轮：循环3次
        //第三轮：循环2次
        for (int i = 0; i < arr.length - 1; i++) {
            //一轮
            //索引3 4的交换就是数据4 5的交换，防止索引越界，条件arr.length - 1，实际i范围 0 - 3 = 4次
            // - 1：目的是防止索引越界
            // - i：目的是提高效率，每往后一轮，比上轮循环少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //比较的是i和i+1
                if (arr[j] > arr[j + 1]) {
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

