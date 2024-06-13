package com.itheima.myextends.Test4;

public class SP extends Dog{
    //用到方法重写
    @Override
    public void eat(){
        super.eat();
        System.out.println("吃骨头");
    }
}
