package com.itheima.Test2;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("aaa");
        stu.setAge(11);
        System.out.println(stu.getName() + stu.getAge());
        stu.show();
    }
}
