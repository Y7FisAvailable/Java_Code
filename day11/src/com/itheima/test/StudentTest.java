package com.itheima.test;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //创建Student类的对象
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",20);

        //定义集合
        ArrayList<Student> list = new ArrayList<>();
        //添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            //stu类不是java中存在的，所以打印后会是地址值，用到get方法
            System.out.println(stu.getName() + "," +stu.getAge());
        }
    }
}
