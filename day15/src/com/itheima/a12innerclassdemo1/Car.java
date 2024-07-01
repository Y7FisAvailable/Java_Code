package com.itheima.a12innerclassdemo1;

public class Car {//外部类
    private String brand;//private后，外部类再调用必须get and set
    int carAge;
    String color;

    //外部类访问内部类成员，需要创建对象
    Engine e = new Engine();

    public void show() {
        System.out.println("外部" + carAge + e.EngineBrand + color);
    }

    public class Engine {//内部类
        private String EngineBrand;
        private int engineAge;

        public void show() {
            //内部类直接访问外部类
            System.out.println("内部" + brand + carAge + color);
        }
    }
}
