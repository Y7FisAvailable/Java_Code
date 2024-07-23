package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//2
                System.out.println("-------------");
                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);
                return o1 - o2;
            }
        });*/

        //Lambda表达式写法
        Arrays.sort(arr, (Integer o1, Integer o2) -> {//2
                System.out.println("-------------");
                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);
                return o1 - o2;
            }
        );
    }
}
