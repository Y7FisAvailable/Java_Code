package com.itheima.Interface;

public class Test1 {
    public static void main(String[] args) {
        //创建几个动物子类的对象
        Frog1 f = new Frog1("小青", 2);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swim();

        Dog1 d = new Dog1("汪汪",2);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.swim();
    }
}
