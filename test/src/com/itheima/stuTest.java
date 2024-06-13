package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class stuTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<stu> list = new ArrayList<>();
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            stu stu = new stu();
            System.out.println("println a stu name");
            String name = sc.next();
            System.out.println("println a stu age");
            int age = sc.nextInt();
            //信息放入对象
            stu.setAge(age);
            stu.setName(name);
            //对象放入集合
            list.add(stu);
        }
        //遍历list
        for (int i = 0; i < list.size(); i++) {
            stu stu = list.get(i);//list中元素取出赋值给对象
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
