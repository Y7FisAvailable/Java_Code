package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
        //定义数组arr1
        int[] arr = {1,2,3,4,5};
        //定义求和变量sum
        int sum = 0;
        //遍历元素
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
