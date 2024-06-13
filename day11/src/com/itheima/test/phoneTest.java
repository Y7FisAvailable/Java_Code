package com.itheima.test;

import java.util.ArrayList;

public class phoneTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<phone>list = new ArrayList<>();
        //创建对象
        phone p1 = new phone("小米",1000.0);
        phone p2 = new phone("苹果",9999.0);
        phone p3 = new phone("锤子",2999.0);
        //存入对象（如果定义方法存入对象，需要先给出集合长度，但是定义的集合长度为0）
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //调用phoneInfo方法【phoneInfo(list)的结果是一个集合】
        for (int i = 0; i < phoneInfo(list).size(); i++) {
            //phone p = phoneInfo(list).get(i);
            //System.out.println(p.getBrand() + "," + p.getPrice());
            System.out.println(phoneInfo(list).get(i).getBrand() + "," + phoneInfo(list).get(i).getPrice());
        }
    }
    //定义方法，返回集合中价格小于3000的手机信息
    public static ArrayList<phone> phoneInfo(ArrayList<phone> list){
        //定义一个集合，用来存储价格小于3000的手机对象
        ArrayList<phone> resultList = new ArrayList<>();
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            double price = list.get(i).getPrice();
            if(price < 3000){
                //价格小于3000，将该对象list.get(i)存入resultList集合中
                resultList.add(list.get(i));
            }
        }
        //遍历结束后，返回存有多个对象的resultList集合
        return resultList;
    }
}
