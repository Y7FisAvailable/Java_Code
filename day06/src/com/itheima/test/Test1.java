package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        C(10,5);
    }

    //定义方法,带参数方法，两个参数
    public static void C(int chang,int kuan){
        int result = 2 * (chang + kuan);
        System.out.println(result);
    }
}
