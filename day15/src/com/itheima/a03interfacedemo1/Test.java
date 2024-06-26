package com.itheima.a03interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("阿绿", 2);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        Dog d = new Dog("豆豆", 3);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.swim();

        Rabbit r = new Rabbit("兔兔", 1);
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();
        //r.swim();//兔子不能调用接口的swim方法
    }
}
