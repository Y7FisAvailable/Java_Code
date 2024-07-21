package com.itheima;

public class test19 {
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


        //一轮
        //索引3 4的交换就是数据4 5的交换，防止索引越界，条件arr.length - 1，实际i范围 0 - 3 = 4次
        for (int i = 0; i < arr.length - 1; i++) {
            //比较的是i和i+1
            if (arr[i] > arr[i + 1]) {
                //交换
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
