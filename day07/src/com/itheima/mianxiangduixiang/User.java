package com.itheima.mianxiangduixiang;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private char sex;
    private int age;
    //构造方法
    public User(){
    }
    public User(String username,String password,String email,char sex,int age){
        //进行赋值，this.指成员变量
        this.username = username;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }
    //set get方法,每个都需要
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }


    //行为
    public void checkpwd(){
        System.out.println("执行确认密码");
    }
    public void zhuCe(){
        System.out.println("注册");
    }
}
