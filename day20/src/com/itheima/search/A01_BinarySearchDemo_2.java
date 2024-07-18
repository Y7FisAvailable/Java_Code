package com.itheima.search;

public class A01_BinarySearchDemo_2 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}


        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arr, 81));


    }

    //定义方法，实现二分查找
    public static int binarySearch(int[] arr, int num) {
        //1.定义两个变量，指向最小最大索引
        int min = 0;
        int max = arr.length - 1;

        //2.循环找到索引，不知循环几次？while true
        while (true) {
            //尽快失败
            if (min > max) {
                return -1;
            }
            //3.定义mid
            int mid = (max + min) / 2;
            if (arr[mid] > num) {
                //3.1说明num在mid左边，min不动，max为mid - 1
                max = mid - 1;
            }else if(arr[mid] < num){
                //3.2说明num在mid右边，max不动，min为mid + 1
                min = mid + 1;
            }else {
                //3.3说明num == mid，找到元素
                return mid;
            }
        }
    }
}
