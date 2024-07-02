package com.itheima.a16innerclassdemo5;

public class Outer {
    int b = 20;

    public void show4(){
        System.out.println("外部类的show4");
    }

    public static void show5(){
        System.out.println("外部类的静态show5");
    }

    public void show1() {
        String name;//方法中的，局部变量
        int age;
        int iii = 0;

        class Inner {//方法中的，局部内部类
            int i = 10;
            int ii = 20;

            public void show2() {
                //直接访问外部类成员,和方法show1内的局部变量iii
                System.out.println(b);
                show4();
                show5();
                System.out.println(iii);

                System.out.println("局部内部类的show2");
            }

            public static void show3() {
                System.out.println("局部内部类的静态show3");
            }
        }

        //外界是无法直接使用（似测试类中无法直接使用javabean类中成员方法内的局部变量）
        //创建局部内部类的对象
        Inner i = new Inner();
        //对象调用内部类的成员变量
        System.out.println("1:" + i);
        System.out.println("2:" + i.i);
        //对象调用内部类的成员方法
        i.show2();
        Inner.show3();
        //直接访问外部类成员
        System.out.println(b);
        show4();
        show5();
    }
}
