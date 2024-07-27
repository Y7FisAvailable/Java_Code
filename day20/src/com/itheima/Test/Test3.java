package com.itheima.Test;

public class Test3 {
    public static void main(String[] args) {
        //有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!
        //以后每天猴子都吃当前剩下来的一半，然后
        //再多吃一个，第10天的时候(还没吃)，发现只剩下一个桃子了，
        //请问，最初总共多少个桃子?
        //
        //今天 = 昨天 / 2 - 1
        //昨天 = （今天 + 1） * 2
        //求day1需要知道day2的情况

        /*
        Fn(10) = 1
        Fn(9) = (Fn(10) + 1) * 2
        Fn(8) = (Fn(9) + 1) * 2
        Fn(7) = (Fn(8) + 1) * 2
        Fn(6) = (Fn(7) + 1) * 2

        Fn(2) = (Fn(3) + 1) * 2
        Fn(1) = (Fn(2) + 1) * 2
        */

        //1.
        System.out.println(getTotal(1));
    }
    //10是结果，推1的总数：反向递归。
    public static int getTotal(int day){
        if(day <= 0 || day >=11){
            System.out.println("时间错误");
            return -1;
        }
        //出口
        if(day == 10){
            return 1;
        }

        //递归规律
        return (getTotal(day + 1) + 1) * 2;
    }
}
