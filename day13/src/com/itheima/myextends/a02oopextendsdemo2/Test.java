package com.itheima.myextends.a02oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z1 = new Zi();
        z1.ziShow();
    }
}

class Fu {
    String name = "Fu";
}

class Zi extends Fu {
    String name = "Zi";

    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
