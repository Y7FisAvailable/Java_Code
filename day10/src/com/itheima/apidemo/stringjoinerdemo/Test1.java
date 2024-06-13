package com.itheima.apidemo.stringjoinerdemo;

public class Test1 {
    public static void main(String[] args) {
        //Sb对象
        StringBuilder sb = new StringBuilder();
        //容量：最多能装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());//默认容量16
        System.out.println(sb.length());//实际长度0

        //添加内容>16，扩容为2*16+2，如果还不够，内容多少容量多少
        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");

        System.out.println(sb.capacity());//扩容容量36
        System.out.println(sb.length());//实际长度36
    }
}
