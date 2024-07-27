package com.itheima.Test;

public class Test4 {
    public static void main(String[] args) {

        //public static void main(String[] args) {
        ///*
        //可爱的小明特别喜欢爬楼梯，他有的时候一次爬一 个台阶， 有的时候一次爬两个台阶，。
        //如果这个楼梯有20个台阶，小明一共有 多少种爬法呢?

        System.out.println(getTotal(20));

    }
    public static int getTotal(int num){
        if(num == 1){
            return 1;
        }else if(num == 2){
            return 2;
        }

        return getTotal(num - 1) + getTotal(num - 2);
    }
}
