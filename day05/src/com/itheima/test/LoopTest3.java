package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入X");
        int x = sc.nextInt();
        //质数判断：x%1=0,%2!=0,%3!=0...%x=0
        //除了%1和本身=0外，其他数字=0了，则不是质数，此时break结束循环
        //起始：2，终止：本身-1，
        //因为任何正整数%1=0，%b本身=0，所以这俩用判断
        //101
        boolean flag = true;
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){//如果for没跑完则说明执行了flag=false，此时不是质数，for跑完则flag不变，则为质数
            System.out.println(x + "是质数");
        }
        else {
            System.out.println(x + "不是质数");
        }
    }
}
