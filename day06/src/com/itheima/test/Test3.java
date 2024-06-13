package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //直接调用，控制台不输出，只是把结果返回过来了
        sum(1,2,3);

        //赋值调用，用变量接收结果
        double s = sum(1,2,3);
        System.out.println(s);

        //输出调用
        System.out.println(sum(1,2,3));
    }

    //定义方法求季度营业额，需要第一二三个月
    public static double sum(double a,double b,double c){
        double result = a + b + c;
        return result;//结果返回给方法调用处
    }
}
