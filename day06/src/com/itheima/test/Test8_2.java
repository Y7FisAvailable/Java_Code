package com.itheima.test;

public class Test8_2 {
    public static void main(String[] args) {
        //定义原始数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //调用
        int[] result = copyOfRange(arr,0,3);
        //System.out.println(result);//取到的只是数组地址！
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
    //定义方法，形成新数组，返回新数组
    public static int[] copyOfRange(int[] arr,int from, int to){//from to是索引序号
        //动态初始化定义新数组
        int[] arr2 = new int[to - from];

        //伪造索引思想，让新数组从0开始
        int Index = 0;

        for(int i = from; i < to; i++){//遍历from到to的元素
            arr2[Index] = arr[i];
            Index++;//新数组索引从0开始自增
        }
        //返回新数组
        return arr2;
    }
}