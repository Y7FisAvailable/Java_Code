package com.itheima.tiaozhuan;

public class TiaoZhuanDemo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if(i == 3){
                //break关键字，跳出整个循环
                break;
            }
        }
    }
}
