package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo4 {
    public static void main(String[] args) {
        /*
        定义数组并存储一- 些字符串，利用Arrays中的sort方法进行排序
        要求:
        按照字符串的长度进行排序，短的在前面，长的在后面。
        (暂时不比较字符串里面的内容)
        */

        String[] arr = {"aa","a","aaaa","aaa"};

        //匿名内部类格式
        /*Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串的长度进行排序
                return o1.length() - o2.length();
            }
        });*/

        //Lambda表达式
        /*Arrays.sort(arr, (String o1, String o2) -> {
                return o1.length() - o2.length();
            }
        );*/

        //Lambda简化
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        //打印字符串数组
        System.out.println(Arrays.toString(arr));
    }
}
