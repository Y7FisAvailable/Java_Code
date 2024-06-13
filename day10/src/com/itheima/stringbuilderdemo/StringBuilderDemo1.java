package com.itheima.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素，任意类型
        sb.append(1);
        sb.append(12.20);
        sb.append(true);

        //3.反转
        sb.reverse();

        //4.获取长度
        int len = sb.length();
        System.out.println(len);//12

        System.out.println(sb);//eurt2.211cba
    }
}
