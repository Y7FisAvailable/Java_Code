package com.itheima.a14innerclassdemo3;

public class Test {
    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner oi = new Outer().new Inner();

        oi.show();
    }
}
