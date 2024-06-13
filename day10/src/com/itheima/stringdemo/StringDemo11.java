package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //定义一句话，包含敏感词
        String talk = "你妈了个逼的，你会玩你妈了个逼，傻狗，回家吃屎吧";
        //定义敏感词库
        String[] str = {"你妈","逼","傻狗","吃屎"};
        //循环词库，找到就替换
        for (int i = 0; i < str.length; i++) {
            talk = talk.replace(str[i],"***");//替换
        }
        System.out.println(talk);
    }
}
