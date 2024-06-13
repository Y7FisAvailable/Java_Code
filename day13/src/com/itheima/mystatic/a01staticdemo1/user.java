package com.itheima.mystatic.a01staticdemo1;

public class user {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public user() {
    }

    public user(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){

        System.out.println("study...");
    }

    public void print(){

        System.out.println(name + "," + age + "," + gender + "," +teacherName);
    }
}
