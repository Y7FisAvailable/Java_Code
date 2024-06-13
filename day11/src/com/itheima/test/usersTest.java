package com.itheima.test;

import java.util.ArrayList;

public class usersTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<users> list = new ArrayList<>();
        //创建users对象
        users u1 = new users(1,"zhangsan","123456");
        users u2 = new users(2,"lisi","123456");
        users u3 = new users(3,"wangwu","123456");
        //users放入list
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //调用searchUser方法
        boolean flag = SearchingUser(4,list);
        System.out.println(flag);
    }
    //定义方法，根据id查询，存在返回t，不存在返回f
    public static boolean SearchingUser(int id,ArrayList<users> list){
        //遍历集合，对比id
        for (int i = 0; i < list.size(); i++) {
            //取出集合中元素的id对比给出id
            users u = list.get(i);
            int uid = u.getId();//以上两步可以链式编程为list.get(i).getId()
            if(id == uid){//注意：.equals()的比较用于字符串比较，int不行
                return true;
            }
        }
        return false;
    }
}
