package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("wang");
        t.setAge(30);

        register(s);
        register(t);
    }

    public static void register(Person person) {
        person.show();
    }
}
