package com.itheima.test;

import java.util.Scanner;

public class Test5_DaFen2 {
    public static void main(String[] args) {
        //录入六次打分，存入数组，范围0-100
        int[] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //得到最高分
        int max = getMax(arr);
        System.out.println("最大值为：" + max);

        //得到最低分
        int min = getMin(arr);
        System.out.println("最小值为：" + min);

        //得到和
        int sum = getSum(arr);

        //（和 - 最高 - 最低）÷（总打分人数 - 2）
        int result = (sum - max - min) / (arr.length - 2);
        System.out.println("最终得分：" + result);
    }

    //得到和
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //得到最低分,形参需要这个数组
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    //得到最高分,形参需要这个数组
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //录入六次打分，存入数组，范围0-100
    //需要返回值
    public static int[] getArr(){
        //定义数组
        int[] scores = new int[6];
        //输入调用
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; ) {//i++放在了下面
            //每个索引塞入打分
            System.out.println("请输入打分情况：");
            int score = sc.nextInt();
            if(score >= 0 && score <= 100){//判断输入合法性？什么时候塞？
                scores[i] = score;
                i++;//注意点：成功塞入分数后，才允许i++，否则执行else后再i++等于跳过了索引0，继续对索引1进行赋值
            }else {
                System.out.println("您的输入有误，请重新输入第" + i + "个分数");
            }
        }
        return scores;//返回值是这个数组
    }
}
