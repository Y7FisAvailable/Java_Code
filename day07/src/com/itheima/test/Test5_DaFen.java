package com.itheima.test;

public class Test5_DaFen {
    public static void main(String[] args) {
        //输入六次打分，0-100，可以放在一个数组里？
        int[] score = {100,1,2,2,2,2};
        //比较六次打分，相互比较

        //假设最大值
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if(max < score[i]){
                max = score[i];//遍历数组获取max
            }
        }
        System.out.println(max);
        //假设最小值
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if(min > score[i]){
                min = score[i];//遍历数组获取min
            }
        }
        System.out.println(min);
        //求和 - 最大 - 最小
        int sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i];
        }
        sum = sum - max - min;
        System.out.println(sum / 4);
    }
}
