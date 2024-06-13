package com.itheima;

public class test1 {
    public static void main(String[] args) {
        //调用方法
        S(2,3);
    }

    //定义方法，输出长方形面积，需要长宽两个参数
    public static void S(int chang, int kuan) {
        int result = chang * kuan;
        System.out.println(result);
    }
}