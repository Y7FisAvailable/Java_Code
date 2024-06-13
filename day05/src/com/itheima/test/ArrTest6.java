package com.itheima.test;

public class ArrTest6 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4,5};

        //定义临时变量temp作为中间量存储
        int temp = 0;

        //定义两个变量ij，在初始位置指向0索引和数组最后一个索引
        for(int i = 0,j = arr.length - 1; i < j; i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;//当i<j时，循环继续；当i=j或者i>j时循环结束
        }
        //打印交换后数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
