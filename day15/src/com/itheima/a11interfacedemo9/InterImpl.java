package com.itheima.a11interfacedemo9;

public class InterImpl extends InterAdapter{
    //实现类 继承 适配器

    //实现类、其他父类、适配器的多层继承：
    //实现类 extends 适配器
    //适配器 extends 其他父类 implements 接口

    //有了适配器，在实现类中，只方法重写需要的那个方法
    @Override
    public void method3() {
        System.out.println("只用到method3");
    }
}
