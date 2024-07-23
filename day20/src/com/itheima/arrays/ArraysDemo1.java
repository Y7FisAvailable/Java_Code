package com.itheima.arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        /*
               public static String toString(数组)                           把数组拼接成一个字符串
               public static int binarySearch (数组，查找的元素)              二分查找法查找元素
               public static int[] copyOf(原数组,新数组长度)                  拷贝数组
               public static int[] copyOfRange(原数组，起始索引，结束索引)     拷贝数组(指定范围)
               public static void fill(数组，元素)                            填充数组
               public static void sort( 数组)                                按照默认方式进行数组排序
               public static void sort(数组，排序规则)                        按照指定的规则排序
        */

        //toString数组变字符串
        System.out.println("---------------------------toString数组变字符串-----------------------");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]

        //binarySearch:二分查找法查找元素
        //细节1:二分查找的前提:数组中的元素必须是有序，数组中的元素必须是升序的
        //细节2:如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是- 插入点- 1
        //疑问:为什么要减1呢?
        //解释:如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        //如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-0
        //为了避免这样的情况，Java在这个基础上又减一。
        System.out.println("---------------------------binarySearch二分查找元素-----------------------");
        System.out.println(Arrays.binarySearch(arr, 2));//索引1
        System.out.println(Arrays.binarySearch(arr, 5));//索引4
        System.out.println(Arrays.binarySearch(arr, 100));//-6，插入点在5后面是索引5，于是-5-1= -6

        //copyOf拷贝数组
        //参数一:老数组
        //参数二:新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度是大于老数组的长度，会补上默认初始值
        System.out.println("---------------------------copyOf拷贝数组-----------------------");
        int[] newArr = Arrays.copyOf(arr, 2);
        System.out.println(Arrays.toString(newArr));//[1, 2]
        System.out.println(newArr.toString());//[I@776ec8df

        //copyOfRange拷贝数组(指定范围)
        //细节：包头不包尾，包左不包右
        System.out.println("---------------------------copyOfRange拷贝数组(指定范围)-----------------------");
        int[] copyOfRange = Arrays.copyOfRange(arr, 1, 2);
        System.out.println(Arrays.toString(copyOfRange));//[2]

        //fill填充数组
        System.out.println("---------------------------fill填充数组-----------------------");
        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0, 0]
        Arrays.fill(arr2, 100);
        System.out.println(Arrays.toString(arr2));//[[100, 100, 100, 100, 100]

        //sort按照默认方式进行数组排序
        System.out.println("---------------------------sort按照默认方式进行数组排序-----------------------");
        int[] arr3 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //sort(数组，排序规则)
        System.out.println("---------------------------sort(数组，排序规则) -----------------------");

        //P182 12.30 sort底层原理


    }
}
