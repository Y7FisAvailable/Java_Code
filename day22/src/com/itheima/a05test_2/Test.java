package com.itheima.a05test_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //当波斯、梨花、泰迪、哈士奇四个类是抽象的时候，无法实例化（创建对象）
        //cat和dog也是抽象类的原因是：抽象类的子类要求：1重写父类全部抽象方法，2本身也得是抽象类
        //不需要创建cat和dog的对象，也不需要方法重写，所以定义为抽象类。
        //HaShiQi hs = new HaShiQi("aa", 2);
        //Student stu = new Student();


        ArrayList<HaShiQi> list1 = new ArrayList<>();
        ArrayList<LiHua> list2 = new ArrayList<>();

        //添加对象
        HaShiQi hs = new HaShiQi();
        hs.setName("lala");
        hs.setAge(2);
        list1.add(hs);

        //抽象类添加对象，匿名内部类形式
        //抽象类的子类要求：1重写父类全部抽象方法，2本身也得是抽象类
        list1.add(new HaShiQi() {
            @Override
            public void eat() {
                System.out.println("吃吃吃");
            }
        });

        keepPet(list1);
        //keepPet(list2);//keepPet方法的泛型为extend dog，而list2是cat

    }
    public static void keepPet(ArrayList<? extends Dog> list){
        //遍历集合，调用方法
        for (Dog dog : list) {
            dog.eat();
        }
    }
}
