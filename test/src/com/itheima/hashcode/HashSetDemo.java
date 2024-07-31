package com.itheima.hashcode;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        /*
            需求：创建一个存储学生对象的集合，存储多个学生对象。
            使用程序实现在控制台遍历该集合。
            要求：学生对象的成员变量值相同，我们就认为是同一个对象
        String   Integer

        */

        //HashSet是一个泛型类，需要在创建对象时，确定泛型类型
        //1.创建集合hs
        HashSet<Student> hs1 = new HashSet<>();

        //2.创建stu对象
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("lisi",24);
        Student stu3 = new Student("wangwu",25);
        Student stu4 = new Student("wangwu",25);
        Student stu5 = new Student("55",25);
        Student stu6 = new Student("66",25);

        hs1.add(stu1);
        hs1.add(stu2);
        hs1.add(stu3);
        hs1.add(stu4);
        hs1.add(stu5);
        hs1.add(stu6);

        System.out.println(hs1);
        //存入顺序 != 取出顺序，因为存入地址是根据哈希值计算确定的。
    }
}
