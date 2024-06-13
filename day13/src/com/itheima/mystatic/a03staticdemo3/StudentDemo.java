package com.itheima.mystatic.a03staticdemo3;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        //定义集合，存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三",18,"男");
        Student stu2 = new Student("李四",16,"男");
        Student stu3 = new Student("王五",999,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
