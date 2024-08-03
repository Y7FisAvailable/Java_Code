package com.itheima.a07test;

//Comparable是个泛型接口，alt + enter
//  使用1：实现类Stu给出具体类型
//  使用2：Stu延续泛型Stu<E>，直到在测试类中创建对象时再确认
public class Stu implements Comparable<Stu> {
    private String name;
    private int age;

    public Stu() {
    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }



    public String toString() {
        return "Stu{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Stu o) {
        //this:要添加的
        //o：已存在的
        return this.getAge() - o.getAge();
    }
}
