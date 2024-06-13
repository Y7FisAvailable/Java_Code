package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11,22,33,44,55};
        //调用方法
        shuZu(arr);
    }
    //定义方法，遍历数组，同行显示
    public static void shuZu(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
