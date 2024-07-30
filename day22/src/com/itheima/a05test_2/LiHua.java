package com.itheima.a05test_2;

public class LiHua extends Cat {

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的" + getAge() + "岁狸花猫，在吃鱼");
    }
}
