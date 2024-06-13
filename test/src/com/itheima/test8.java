package com.itheima;

public class test8 {
    public static void main(String[] args) {
        //调用
        //1.强转调用
        xiangTong((byte)10,(byte)20);
        //2.定义变量调用
        byte a = 10;
        byte b = 20;
        xiangTong(a,b);
    }
    //方法1定义
    public static void xiangTong(int num1,int num2){
        //比较1和2
        System.out.println(num1 == num2);
    }
    public static void xiangTong(byte num1,byte num2){
        //比较1和2
        System.out.println(num1 == num2);
    }
    public static void xiangTong(short num1,short num2){
        //比较1和2
        System.out.println(num1 == num2);
    }
    public static void xiangTong(long num1,long num2){
        //比较1和2
        System.out.println(num1 == num2);
    }
}
