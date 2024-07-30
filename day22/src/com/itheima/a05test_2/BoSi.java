package com.itheima.a05test_2;

public class BoSi extends Cat {

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁波斯猫，在吃小饼干");
    }
}
