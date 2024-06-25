package com.itheima.DaCaP;

public class Dog extends Animal {
    //属性无需重写，父类中有，已继承，但需要getter and setter

    //子类构造方法要写
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //吃方法重写
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的" + "狗两只前腿死死的抱住" + something + "猛吃！");
    }

    //特有方法
    public void lookhome(){
        System.out.println("狗在看家");
    }
}
