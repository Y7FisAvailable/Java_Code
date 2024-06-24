package com.itheima.a03polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        //创建饲养员
        Person p1 = new Person("老王",30);
        Dog d = new Dog(2,"黑色");
        p1.keepPet(d,"骨头");

        Person p2 = new Person("小张",22);
        Cat c = new Cat(3,"灰色");
        p2.keepPet(c,"小鱼干");

    }
}
