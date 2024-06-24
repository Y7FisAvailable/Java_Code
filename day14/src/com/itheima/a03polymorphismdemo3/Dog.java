package com.itheima.a03polymorphismdemo3;

public class Dog extends Animal {
    //不能继承父类构造方法，得自己写
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something) {
        //age是父类的私有化变量，子类要用，必须用get
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死的抱住" + something + "狂吃");
    }

    public void lookhome() {
        System.out.println("狗狗在看家");
    }
}
