package com.itheima.stringdemo;

public class StringDemo9 {
    public static void main(String[] args) {
        String phoneNumber = "19991977458";
        //截取前三位
        String start = phoneNumber.substring(0,3);
        //截取后四位
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
