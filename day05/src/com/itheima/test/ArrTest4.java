package com.itheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {33,5,22,44,55};
        //假定最大的元素max
        //注意：max的初始化值，一定是数组中存在的值
        int max = arr[0];
        //遍历数组
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){//max < 数组元素i
                max = arr[i];//覆盖max
            }
        }
        //循环结束，打印最大值max
        System.out.println(max);
    }
}
