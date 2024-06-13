package com.itheima.test;

public class Test4_FuZhi {
    public static void main(String[] args) {
        //定义一个数组1
        int[] arr1 = {1,2,3,4,5};

        //定义新数组2，长度是arr1的length
        int[] arr2 = new int[arr1.length];

        //定义假索引
        int index = 0;

        //遍历数组1，对应索引
        for (int i = 0; i < arr1.length; i++) {
            arr2[index] = arr1[i];//0 1 2 3 4
            index++;//1 2 3 4 5
            //注意：因为新老数组等长，所以老数组的索引i就是新数组的i
            //  可以不定义假索引index，直接arr2[i] = arr1[i]完成复制
        }
        //遍历数组2
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
