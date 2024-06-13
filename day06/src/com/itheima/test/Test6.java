package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //调用
        System.out.println(maxnum(arr));

    }
    //定义方法，求数组最大值，并返回
    public static int maxnum(int[] arr) {
        //假定arr[0]元素是最大值
        int max = arr[0];

        //遍历数组
        for (int i = 1; i < arr.length; i++) {//不需要自身比一次，i从1开始
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        //对比结束
        return max;
    }
}
