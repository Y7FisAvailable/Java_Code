package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "Abc";

        //地址值比较
        System.out.println(s1 == s2);//false!
        //字符串对象的内容的比较
        boolean result1 = s1.equals(s2);//false!区分大小写A、a
        System.out.println(result1);
        //字符串对象的内容的比较，忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);//true!
        System.out.println(result2);
    }
}
