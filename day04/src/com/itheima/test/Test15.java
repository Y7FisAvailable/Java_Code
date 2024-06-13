package com.itheima.test;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        //键盘输入两个数字当范围
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数字");
        int start = sc.nextInt();
        System.out.println("第二个数字");
        int end = sc.nextInt();

        int ok = 0;//记录个数的变量
        for(int i = start; i <= end; i++){//范围挨个打印
            if(i % 3 == 0 && i % 5 == 0){//满足整除
                ok++;//记录个数+1
            }
        }
        System.out.println("有" + ok + "个");
    }
}
