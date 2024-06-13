package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        //注意点：
        //1.随机数代码int num = r.nextInt(100) + 1;
        //不能写在循环里面，否则每次循环都生成新的随机数

        //抽奖机制：保底
        //三次不中，触发保底，中了
        //添加计数器count，统计猜了几次了？
        int count = 0;

        Random r = new Random();
        //产生1-100的随机数
        int num = r.nextInt(100) + 1;
        //手动录入
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("请输入你的数字");
            int guess = sc.nextInt();
            //上面是手动输入，输入后表示猜了，计数器+1
            count++;
            if(count == 3){
                //触发保底
                System.out.println("中了");
                break;//保底后循环结束
            }

            //提示大小
            if(guess > num){
                System.out.println("大了");
            }else if(guess < num){
                System.out.println("小了");
            }else {
                System.out.println("中了");
                break;//猜中就结束循环
            }
        }
    }
}
