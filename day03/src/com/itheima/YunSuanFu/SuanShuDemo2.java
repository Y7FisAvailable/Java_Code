package com.itheima.YunSuanFu;

public class SuanShuDemo2 {
    //main方法，程序的主入口
    public static void main(String[] args) {
        //除法（/）
        //结论：
        //1.整数参与计算，结果为整数
        //2.小数参与计算，结果可能不精确
        System.out.println(10 / 5);//2
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335

        //取模，取余，实际上也是除法，只是结果为余数
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1
    }
}
