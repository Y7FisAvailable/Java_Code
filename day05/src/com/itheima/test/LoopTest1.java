package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                System.out.println("过！");
                continue;//逢7打印过，然后跳过本次循环，继续下次
            }
            System.out.println(i);
        }
    }
}
