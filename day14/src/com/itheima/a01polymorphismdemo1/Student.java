package com.itheima.a01polymorphismdemo1;

public class Student extends Person {
    //方法重写
    @Override
    public void show() {
        //子类没有写实参构造，所以默认有个空参构造
        //空参构造必须用get and set添加元素
        System.out.println("学生的信息是" + getName() + "," + getAge());
    }
}
