package com.itheima.mystatic.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    //定义工具类
    //1.私有化构造方法：目的：不让外界创建该类的对象
    //因为它是工具，创建对象无意义
    private StudentUtil() {
    }

    //2.定义工具类的方法
    public static int getMaxAge(ArrayList<Student> list) {
        //参照物
        //int max = list.get(0).getAge();//list的0索引的age
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            //当一个方法的返回值需要反复使用，可以用临时变量记录，提高效率
            int age = list.get(i).getAge();
            if (age > max) {
                max = age;
            }
        }
        return max;
    }
}
