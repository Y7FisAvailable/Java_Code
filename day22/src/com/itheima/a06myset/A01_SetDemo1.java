package com.itheima.a06myset;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {
       /*
           利用Set系列的集合，添加字符串，并使用多种方式遍历。
            迭代器
            增强for
            Lambda表达式

        */

        //多态创建对象
        Set<String> s = new HashSet<>();
        List<String> list = new ArrayList<>();

        //添加
        s.add("aaa");
        //1.不可重复
        //s.add("aaa");
        s.add("bbb");
        s.add("ccc");

        System.out.println(s);//2.无序：[aaa, ccc, eee, ddd, ggg, fff]
        //s.get()无法get出索引
        //list.get()

        //1.迭代器遍历
        /*Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }*/

        //2.增强for
        /*for (String s1 : s) {
            //s1:表示遍历出来的每个元素
            System.out.println(s1);
        }*/


        //3.Lambda 匿名内部类
        s.forEach(s2 -> System.out.println(s2));

        //#######################################################################################################



        /*//1.创建一个Set集合的对象
        Set<String> s = new HashSet<>();

        //2,添加元素
        //注意：
        //  List系列集合中，add是带有布尔返回值的，但是List系列允许元素重复，故add的返回值无需考虑
        //  而Set系列集合中，元素不允许重复，所以要注意add方法的返回值！

        //如果当前元素是第一次添加，那么可以添加成功，返回true
        //如果当前元素是第二次添加，那么添加失败，返回false
        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //3.打印集合
        //无序
        //System.out.println(s);//[李四, 张三, 王五]

        //迭代器遍历
       *//* Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
*//*

        //增强for
       *//* for (String str : s) {
            System.out.println(str);
        }*//*

        // Lambda表达式
        s.forEach( str->System.out.println(str));*/


    }
}
