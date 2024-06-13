package com.itheima.test;

import java.util.ArrayList;

public class usersTest2 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<users> list = new ArrayList<>();
        //创建users对象
        users u1 = new users(1,"zhangsan","123456");//0
        users u2 = new users(2,"lisi","123456");//1
        users u3 = new users(3,"wangwu","123456");//2
        //users放入list
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //调用SearchIndex方法
        int index = SearchIndex(5,list);
        System.out.println(index);

    }
    //定义方法，根据id查询，存在返回索引，不存在返回-1
   public static int SearchIndex(int id,ArrayList<users> list){
        //遍历集合
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getId() == id){
               return i;
           }
       }
       return -1;
   }
}
