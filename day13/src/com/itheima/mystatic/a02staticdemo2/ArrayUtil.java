package com.itheima.mystatic.a02staticdemo2;

public class ArrayUtil {
    //私有化构造方法：目的：不让外界创建该类的对象
    // 工具是不需要创建对象的！只需要外界调用使用即可！
    private ArrayUtil() {
    }

    //定义工具类方法，为static静态的，方便调用
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);//i索引 arr[i]元素
            } else {
                sb.append(arr[i] + ",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
