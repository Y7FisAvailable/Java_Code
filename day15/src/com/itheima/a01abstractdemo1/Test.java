package com.itheima.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //Person p = new Person();//抽象类不能创建对象

        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(10);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
