package com.itheima.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        //创建子类对象
        Frog f = new Frog();
        //成员变量私有化，只能用getandset
        f.setName("青蛙");
        f.setAge(3);
        System.out.println(f.getAge() + "岁的" + f.getName());
        f.drink();
        f.eat();

        Dog d = new Dog();
        d.setName("狗子");
        d.setAge(2);
        System.out.println(d.getAge() + "岁的" + d.getName());
        d.drink();
        d.eat();

        Sheep s = new Sheep();
        s.setName("山羊");
        s.setAge(1);
        System.out.println(s.getAge() + "岁的" + s.getName());
        s.drink();
        s.eat();
    }
}
