package com.itheima.a04mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
            泛型接口的两种使用方式：
                1.实现类给出具体的类型
                2.实现类延续泛型，创建实现类对象时再确定类型
        */


        //实现类给出具体的类型<String>,创建变量时可以不写泛型
        //public class MyArrayList2 implements List<String> {
        MyArrayList2 list1 = new MyArrayList2();

        //实现类延续泛型，创建实现类对象时再确定类型
        //public class MyArrayList3<E> implements List<E> {
        MyArrayList3<String> list2 = new MyArrayList3<>();






    }
}
