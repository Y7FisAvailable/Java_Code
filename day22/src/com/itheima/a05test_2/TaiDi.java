package com.itheima.a05test_2;

public class TaiDi extends Dog {

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁泰迪，在吃骨头，边吃边层蹭");
    }
}
