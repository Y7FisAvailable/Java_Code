package com.itheima.a02polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //多态方法创建
        Animal a = new Dog();

        //变量调用！编译看左边，运行看左边
        System.out.println(a.name);//动物

        //方法调用！编译看左边，运行看右边
        a.show();//狗---show

        if(a instanceof Dog){
            Dog d = (Dog) a;
            d.lookhome();
        }else if(a instanceof Cat){
            Cat c = (Cat) a;
            c.catchMouse();
        }
    }
}

class Animal{
    String name = "动物";
    public void show(){
        System.out.println("动物---show");
    }
}

class Dog extends Animal{
    String name = "狗";
    @Override
    public void show(){
        System.out.println("狗---show");
    }
    //特有方法
    public void lookhome(){
        System.out.println("狗看家");
    }
}

class Cat extends Animal{
    String name = "猫";
    @Override
    public void show(){
        System.out.println("猫---show");
    }
    //特有方法
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}