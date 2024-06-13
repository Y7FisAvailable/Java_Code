package com.itheima.mianxiangduixiang;

public class GF1 {
    //属性，成员变量
    //对成员变量private私有化
    private String name;
    private int age;
    private char sex;

    //对成员变量提供set方法，get方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量（也就是属性）
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("error");
        }
    }
    public int getAge(){
        return age;
    }

    public void setSex(char sex){
        this.sex = sex;
    }
    public char getSex(){
        return sex;
    }

    //行为，成员方法
    public static void eat(){
        System.out.println("eat");
    }
    public static void sleep(){
        System.out.println("sleep");
    }
}
