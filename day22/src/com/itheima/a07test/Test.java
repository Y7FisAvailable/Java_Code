package com.itheima.a07test;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //1.创建集合
        TreeSet<Stu> ts = new TreeSet<>();
        //2.对象
        Stu stu1 = new Stu("zhangsan",23);
        Stu stu2 = new Stu("lisi",24);
        Stu stu3 = new Stu("wangwu",25);
        //3.add
        ts.add(stu1);
        ts.add(stu2);
        ts.add(stu3);
        //4.排序
        System.out.println(ts);

        //迭代器
        Iterator<Stu> it = ts.iterator();
        while (it.hasNext()) {
            Stu next = it.next();
            System.out.println(next);
        }
    }
}
