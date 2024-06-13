package com.itheima;

public class test2 {
    public static void main(String[] args) {
        //直接买的价格
        double erShou = 7988 - 1500;
        double huanXin = 7988 * 0.8;
        if(erShou > huanXin){
            System.out.println("换新");
        }else if(erShou == huanXin){
            System.out.println("都可以");
        }else {
            System.out.println("二手");
        }
    }
}
