package com.itheima.DaCaP;

public class Test {
    public static void main(String[] args) {
        //创建person类对象
/*      Person p1 = new Person();
        p1.setAge(30);
        p1.setName("老王");
        Dog d = new Dog(3,"黑");
        p1.keepPet(d,"gutou");

        Person p2 = new Person();
        p2.setAge(22);
        p2.setName("老陈");
        Cat c = new Cat(2,"灰");
        p2.keepPet(c,"yu");
        */

        Person p = new Person();
        p.setAge(30);
        p.setName("老王");
        Dog d = new Dog(3,"黑");
        p.keepPet(d,"骨头");
        d.lookhome();
        Cat c = new Cat(2,"灰");
        p.keepPet(c,"鱼");
        c.catchMouse();
    }
}
