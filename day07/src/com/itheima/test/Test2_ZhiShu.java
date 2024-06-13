package com.itheima.test;

public class Test2_ZhiShu {
    public static void main(String[] args) {
        //找101-200的质数：只有1和本身两个因数，并输出个数和每个质数

        //先循环，个数用计数器count，打印
        int count = 0;

        for (int i = 101; i <= 200; i++) {
            //定义flag判断是否为质数
            boolean flag = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    //不是质数
                    flag = false;
                    break;//注意：break跳出的是循环for，和if无关
                }
            }
            if(flag){
                count++;
                System.out.println(i + "当前数字是质数");
            }
        }
        System.out.println("共有" + count + "个质数");
    }
}
