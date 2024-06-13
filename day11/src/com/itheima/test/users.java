package com.itheima.test;

public class users {
    //定义javaBean类
    private int id;
    private String username;
    private String password;
    //有无参构造
    public users() {
    }

    public users(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    //get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
