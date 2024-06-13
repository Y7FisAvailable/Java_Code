package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建集合的对象list
        ArrayList<String> list = new ArrayList<>();

        //增,返回boolean类型的true
        list.add("abc");//[abc]
        list.add("def");//[abc,def]
        list.add("ghi");//[abc,def,ghi]

        //删，删除元素,返回true or false
        boolean result1 = list.remove("abc");//[def,ghi]
        System.out.println(result1);
        //删，删除指定索引下元素，返回删除的元素
        String result2 = list.remove(0);//删除了def，[ghi]
        System.out.println(result2);

        //改，修改指定索引下元素，返回原来的元素
        String result3 = list.set(0,"aaa");//修改0索引下元素ghi，改为“aaa”，[aaa]
        System.out.println(result3);

        list.add("abc");
        list.add("def");
        list.add("ghi");//[aaa,abc,def,ghi]

        //查，查询指定索引下元素，返回该元素
        String result4 = list.get(1);
        System.out.println(result4);//abc
        //查，集合长度，返回集合中元素个数
        int num = list.size();
        System.out.println(num);

        System.out.println(list);
    }
}
