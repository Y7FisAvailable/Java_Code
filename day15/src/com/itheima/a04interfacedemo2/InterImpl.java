package com.itheima.a04interfacedemo2;

public class InterImpl implements Inter1, Inter2 {
    //         实现类      实现     接口1   接口2

    @Override
    public void method1() {
        //因为接口12中都有method1，所以实现类中只重写1次
    }

    @Override
    public void method2() {
        //同method1
    }

    @Override
    public void method3() {

    }

}
