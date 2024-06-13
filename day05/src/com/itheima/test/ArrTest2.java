package com.itheima.test;

public class ArrTest2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义个数计数器
        int count = 0;
        //遍历元素
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){//该元素%3==0说明能整除
                count++;//计数器+1
            }
        }
        //遍历整个数组后，打印count，即为个数
        System.out.println("该数组中有" + count + "个能被3整除的数字");
    }
}
