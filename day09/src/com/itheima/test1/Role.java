package com.itheima.test1;

import java.util.Random;

public class Role {
    //1.定义成员变量
    private String name;
    private int blood;
    //2.创建无参构造和有参构造

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    //3.创建set和get方法

    public String getName() {
        //返回变量name的值
        return name;
    }

    public void setName(String name) {
        //测试类创建对象，传个name进来，把name赋值给成员变量this.
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //4.创建成员方法
    public void attack(Role role){//role1打role2，形参是role2
        //随机造成伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;//范围1-20

        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //挨揍人的剩余血量
        role.setBlood(remainBlood);//第一次：set100血-hurt20血=remainblood80血，第二次：set的基础血量就不再是100，而是80

        System.out.println(this.getName() + "打了" + role.getName() + "一下，"
    + "造成了" + hurt + "点伤害，" + role.getName() + "剩余" + remainBlood + "点血量");
    }
}
