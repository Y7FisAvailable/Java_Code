package com.itheima.mysort;

import java.util.Random;

public class A05_QuickSortDemo_2 {
    public static void main(String[] args) {
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */

        //int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        int[] arr = new int[10000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();//不写范围默认在int范围中
        }

        long s = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long e = System.currentTimeMillis();

        System.out.println(e - s);
        //课堂练习：
        //我们可以利用相同的办法去测试一下，选择排序，冒泡排序以及插入排序运行的效率
        //得到一个结论：快速排序真的非常快。

        /*
        //方法执行后，遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */
    }

    //定义方法实现快速排序
    public static void quickSort(int[] arr, int i, int j) {
        /*
         *   参数一：我们要排序的数组
         *   参数二：要排序数组的起始索引
         *   参数三：要排序数组的结束索引
         */
        //1.定义两个可变变量，记录查找范围i~j
        int start = i;
        int end = j;

        //递归出口
        //i和j在方法的开始是要赋值给start和end的
        //意味着左范围每次递归i为常量，j为变量每次在-1，j在靠近i，最终会出现end < start的情况
        if(start > end){
            return;
        }

        //2.定义基准值,数组第一个索引，0索引元素
        int baseNum = arr[i];

        //3.一轮循环，找到要交换的数字，最后让基准值归位
        //当start == end，第一轮结束
        while (start != end) {

            //4.end往左遍历，找到比基准值小的数字，停下
            //需要找几个？————不知道true死循环
            //
            //停止条件：
            //  1)索引越界、相等时停下
            //  2)end索引指向的元素，比基准值小，停下
            while (true) {
                if (end <= start || arr[end] < baseNum) {//第一次end=j，j是最大索引，比如10
                    break;
                }
                end--;//end不满足停下条件，10-1=9，当end=9时继续循环
            }

            //5.start往右遍历，找到比基准数大的数字，停下
            while (true) {
                if (end <= start || arr[start] > baseNum) {
                    break;
                }
                start++;
            }

            //6.end和star停下，准备交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //本轮交换结束
        //条件：索引start == end
        //此时，交换start（end）索引上的元素，
        //和谁交换？
        //————和数组索引范围的第一个元素
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的范围，重复刚做的事情
        quickSort(arr, i, start - 1);
        //确定6右边的范围
        quickSort(arr, start + 1, j);

        //i和j在方法的开始是要赋值给start和end的
        //意味着左范围每次递归i为常量，j为变量每次在-1，j在靠近i，最终会出现end < start的情况
    }
}
