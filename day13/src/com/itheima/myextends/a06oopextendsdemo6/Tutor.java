package com.itheima.myextends.a06oopextendsdemo6;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("助教在批改作业！");
    }
}
