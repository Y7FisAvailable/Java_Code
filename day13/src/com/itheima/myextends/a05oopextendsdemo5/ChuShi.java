package com.itheima.myextends.a05oopextendsdemo5;

public class ChuShi extends YuanGong {
    //1.私有化成员变量不用写，父类有
    //2.构造方法需要写！因为子类不能继承父类的构造方法！
    public ChuShi() {
    }

    public ChuShi(String id, String name, double salary) {
        super(id, name, salary);
    }

    //3.get and set 不用写，父类有

    //4.方法
    @Override
    public void work(){
        System.out.println("厨师在炒菜");
    }
}
