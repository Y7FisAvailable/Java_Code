package com.itheima.myextends.a06oopextendsdemo6;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("采购专员在采购！");
    }
}
