package com.itheima.a14innerclassdemo3;

class Outer {
    private int a = 10;//外部类成员变量

    class Inner {
        private int a = 20;//内部类成员变量

        public void show() {
            int a = 30;//局部变量
            System.out.println(a);//30
            System.out.println(this.a);//20

            //Outer.this 获取了外部类对象的地址值
            System.out.println(Outer.this.a);//10

            //相当于创建了对象，然后用对象调用对应类的变量a
            System.out.println(new Outer().a);//10
            System.out.println(new Inner().a);//20
        }
    }
}
