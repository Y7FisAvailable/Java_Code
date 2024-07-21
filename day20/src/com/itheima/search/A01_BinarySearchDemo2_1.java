package com.itheima.search;

public class A01_BinarySearchDemo2_1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 6;
        System.out.println(getIndex(arr, number));

    }

    //定义一个方法利用二分查找
    public static int getIndex(int[] arr, int number) {
        //1.首先定义min和max索引，指向要查找的范围
        int min = 0;
        int max = arr.length - 1;

        //2.mid表示中间值的[索引]，所以它一直会变
        //不知道第几次会找到number，所以whiletrue循环
        while (true) {

            //尽快失败
            if(min > max){
                return -1;
            }

            //找到min和max的中间位置
            int mid = (max + min) / 2;

            if (arr[mid] < number) {
                //说明number在右边，max不动，min=mid + 1
                min = mid + 1;
            } else if (arr[mid] > number) {
                //说明number在左边
                max = mid - 1;
            }else {
                //说明mid == number
                return mid;
            }
        }
    }
}
