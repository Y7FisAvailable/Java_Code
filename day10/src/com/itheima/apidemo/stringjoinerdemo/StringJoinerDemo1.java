package com.itheima.apidemo.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //定义sj类
        StringJoiner sj = new StringJoiner("---","[","]");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //长度
        int len = sj.length();
        System.out.println(len);//14
        //打印
        System.out.println(sj);
        //toString
        String str = sj.toString();
        System.out.println(str);
    }
}
