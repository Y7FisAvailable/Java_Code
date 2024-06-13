package com.itheima.test1;

public class GameTest {
    public static void main(String[] args) {
        //根据类创建对象
        Role role1 = new Role("张三",100);
        Role role2 = new Role("李四",100);

        //PK，并不知道第几回合结束，故while死循环 + 判断条件
        while(true){
            //调用攻击方法
            role1.attack(role2);

            if(role1.getBlood() == 0){
                System.out.println(role2.getName() + "取得胜利！");
                break;//跳出while循环
            }

            role2.attack(role1);
            if(role2.getBlood() == 0){
                System.out.println(role1.getName() + "取得胜利！");
                break;//跳出while循环
            }
        }
    }
}
