package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复
        //{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr1 = {131, 127, 147, 81, 103, 23, 7, 79};
        int num1 = 23;
        System.out.println(getIndex1(arr1, num1));//索引5


        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 3 8
        int[] arr2 = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int num2 = 81;
        System.out.println(getIndex2(arr2, num2));//索引[3, 8]
    }

    //定义一个方法利用基本查找，查询某个元素在数组中的索引
    //需要：数组
    //需要：查找的元素
    //需要：需要返回值吗？
    public static int getIndex1(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    //定义一个方法利用基本查找，查询某个元素在数组中的索引
    //需要：数组
    //需要：查找的元素
    //需要：需要返回值吗？
    //心得：如果我们要返回多个数据的话，可以把这些数据放到数组或者集合中。
    public static ArrayList<Integer> getIndex2(int[] arr,int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                list.add(i);
            }
        }
        return list;
    }
}
