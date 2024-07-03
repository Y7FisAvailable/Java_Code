package com.itheima.a17innerclassdemo6;

public class Test {
    public static void main(String[] args) {
        //创建匿名内部类的对象
        new Swim() {
            @Override
            public void swim() {
                System.out.println("方法重写swim2");
            }
        };

        //创建Student类的对象
        Student stu = new Student();
        stu.swim();

        //在测试类中调用下面的method方法？
        //以前的方法如何调用？
        //要先写子类继承Animal类
        //再创建子类对象，把对象当作参数传递给method方法
        Dog d = new Dog();
        method(d);
        //如果dog类只用一次，还要定义个类，很麻烦

        //所以使用匿名内部类，简化代码
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }//相当于把匿名内部类对象当作参数传递给了Animal a
                //而匿名内部类继承了Animal父类，所以匿名内部类对象是Animal
                //的一个子类对象，【Animal a = 子类对象】形成多态
        );

    }

    public static void method(Animal a) {//Animal a = 子类对象
        a.eat();//多态：方法：编译看左边，运行看右边
    }
}
