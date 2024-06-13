package com.itheima;

public class Student3 {
    //属性，用户名、密码、身份证、手机号
    private String username;
    private String password;
    private String idNumber;
    private String phoneNumber;

    //有参无参
    public Student3() {
    }

    public Student3(String username, String password, String idNumber, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    //get and set

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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
