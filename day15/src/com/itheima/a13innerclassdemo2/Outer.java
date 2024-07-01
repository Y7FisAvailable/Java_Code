package com.itheima.a13innerclassdemo2;

public class Outer {
    String name;

    private class Inner{
        //成员内部类
        static int i = 10;
    }

    public Inner getInner(){
        //在外部类编写方法
        //对外提供内部类对象
        return new Inner();
    }
}
