package com.itheima.myextends.a03oopextendsdemo3;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";
}

class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";

    public void show(){
        //打印zi
        System.out.println(this.name);
        //打印fu
        System.out.println(super.name);
        //喝茶
        System.out.println(super.hobby);
        //吃鸡
        System.out.println(this.game);
    }
}
