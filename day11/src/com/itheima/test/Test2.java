package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //1.定义集合
        ArrayList<Integer> list = new ArrayList<Integer>();
        //2.添加数字
        list.add(123);//字符型数字
        list.add(456);
        list.add(789);
        //3.遍历集合
        String result = "[";
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);//Integer包装类的结果是int整型
            if(i == list.size() - 1){
                result += num;
            }else{
                result += num + ",";
            }
        }
        result += "]";
        System.out.println(result);
    }
}
