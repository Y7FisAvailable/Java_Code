package com.itheima.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //创建StringBuilder类的对象sb
        StringBuilder sb = new StringBuilder("aaa");

        //链式编程
        sb.append("bbb").append("ccc").append("ddd");

        System.out.println(sb);//aaabbbcccddd
    }
}
