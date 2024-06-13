package com.itheima.test;

public class Test6_JiaMi {
    public static void main(String[] args) {
        //定义数组，存入四位数字
        int[] arr = {1,9,8,3};

        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }

        //%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //反转
        for (int i = 0,j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
