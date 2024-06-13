package com.itheima.myextends.a05oopextendsdemo5;

public class JingLi extends YuanGong {
    private double bouns;

    //空参构造
    public JingLi(double bouns) {
        this.bouns = bouns;
    }
    //带全部参数的构造，全部参数 = 父类参数 + 子类参数！
    public JingLi(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work(){
        System.out.println("经理管别人");
    }
}
