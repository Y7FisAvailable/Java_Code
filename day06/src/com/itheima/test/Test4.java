package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //调用方法
        int L1 = S(1,3);
        int L2 = S(2,3);
        if(L1 > L2){
            System.out.println("L1大");
        }else if(L1 < L2){
            System.out.println("L2大");
        }else{
            System.out.println("一样大");
        }
    }
    //定义方法，输出长方形面积，需要长宽两个参数
    public static int S(int chang, int kuan){
        int result = chang * kuan;
        return result;
    }
}
