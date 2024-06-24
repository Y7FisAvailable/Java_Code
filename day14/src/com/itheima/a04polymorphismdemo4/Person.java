package com.itheima.a04polymorphismdemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something) {
        if(a instanceof Dog d){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的狗");
            d.eat(something);//这里区分是猫是狗
            d.lookhome();
        }else if(a instanceof Cat c){
            System.out.println("年龄为" + age + "的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的猫");
            c.eat(something);
            c.catchMouse();
        }else{
            System.out.println("没有这个类型");
        }
    }
}
