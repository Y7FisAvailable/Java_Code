package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //匿名内部类写法
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("-------------");
                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);
                return o1 - o2;
            }
        });*/

        //Lambda表达式写法
        /*Arrays.sort(arr, (Integer o1, Integer o2) -> {
            System.out.println("-------------");
            System.out.println("o1:" + o1);
            System.out.println("o2:" + o2);
            return o1 - o2;
        });*/

        //Lambda的省略写法
        /*lambda的省略规则:
        1.参数类型可以省略不写。
        2.如果只有一一个参数，参数类型可以省略，同时()也可以省略。
        3.如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。*/
        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));

    }
}
