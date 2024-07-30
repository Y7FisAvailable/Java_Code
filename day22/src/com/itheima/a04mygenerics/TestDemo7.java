package com.itheima.a04mygenerics;

import java.util.ArrayList;

public class TestDemo7 {
    public static void main(String[] args) {
        /*
            泛型不具备继承性：方法形参限定
            但是数据具备继承性：
        */
        ArrayList<Ye1> list1 = new ArrayList<>();
        ArrayList<Fu1> list2 = new ArrayList<>();
        ArrayList<Zi1> list3 = new ArrayList<>();

        ArrayList<Student> list4 = new ArrayList<>();

        method(list1);
        //method(list2);
        //method(list3);

        //但是数据具备继承性
        list1.add(new Ye1());
        list1.add(new Fu1());
        list1.add(new Zi1());

    }

    public static void method(ArrayList<Ye1> list){

    }
}

class Ye1{}
class Fu1 extends Ye1{}
class Zi1 extends Fu1{}