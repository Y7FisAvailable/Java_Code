package com.itheima.mystatic.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String result1 = ArrayUtil.printArr(arr);
        System.out.println(result1);

        double[] arr2 = {1.1, 2.2, 3.3};//2.2
        double result2 = ArrayUtil.getAverage(arr2);
        System.out.println(result2);

    }
}
