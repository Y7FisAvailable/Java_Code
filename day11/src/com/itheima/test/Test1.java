package com.itheima.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<String> list = new ArrayList<>();

        //添加
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        //遍历
        String result = "[";//拼左括号
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(i == list.size() - 1){//最大索引
                result += str;
            }else{
                result += str + ",";
            }
        }
        result += "]";//拼右括号
        System.out.println(result);
    }
}
