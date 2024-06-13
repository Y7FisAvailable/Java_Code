package com.itheima.tiaozhuan;

public class TiaoZhuanDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                //continue关键字，结束本次循环，继续下次循环
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
