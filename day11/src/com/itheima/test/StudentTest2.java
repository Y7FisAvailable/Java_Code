package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest2 {
    public static void main(String[] args) {
        //1.定义集合
        ArrayList<Student> list = new ArrayList<>();

        //2.键盘录入
        Scanner sc = new Scanner(System.in);

        //3.遍历数组
        for (int i = 0; i < 3; i++) {//空集合，遍历长度，为0
            //4.创建stu对象
            Student stu = new Student();

            System.out.print("请输入学生姓名：");
            String name = sc.next();
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();

            //5.name age塞入stu对象
            stu.setName(name);
            stu.setAge(age);

            //6.stu对象塞入集合
            list.add(stu);
        }
        System.out.println(list.size());//存入stu对象后，获取集合长度
        //7.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
