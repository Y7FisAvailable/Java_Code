package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo2_1 {
    public static void main(String[] args) {
        //课堂练习1：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复
        //{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr1 = {131, 127, 147, 81, 103, 23, 7, 79};
        int number1 = 127;
        System.out.println(getIndex1(arr1, number1));//1


        //课堂练习2：
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性
        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 3 8
        int[] arr2 = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number2 = 81;
        System.out.println(getIndex2(arr2, number2));//[3, 8]
    }

    //练习1：
    public static int getIndex1(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //练习2，要求返回多个元素,多个元素用集合装
    public static ArrayList<Integer> getIndex2(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
