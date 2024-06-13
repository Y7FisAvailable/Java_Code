package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,34,5,234,42,6,88,55,42,62};

        //接收数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();

        //调用
        boolean R = cunZai(arr,num);
        System.out.println(R);

    }
    //定义方法
    public static boolean cunZai(int[] arr, int num){

        //flag标记
        boolean result = false;
        //遍历
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                result = true;//或者直接在这里return true！
            }
        }
        //遍历数组中的全部元素，才能断定num是否存在呢？
        return result;//在上面return true这里就return false了
    }
}
