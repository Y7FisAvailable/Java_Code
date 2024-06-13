package com.itheima.mystatic.a01staticdemo1;

public class userTest {
    public static void main(String[] args) {
        user.teacherName = "bitch";
        user u1 = new user();
        u1.setName("zhangsan");
        u1.setAge(11);
        u1.setGender("男");
        u1.study();
        u1.print();
    }
}
