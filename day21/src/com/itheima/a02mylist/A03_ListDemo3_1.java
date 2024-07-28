package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo3_1 {
    public static void main(String[] args) {
        /*
            List系列集合的五种遍历方式：
                1.迭代器
                2.列表迭代器
                3.增强for
                4.Lambda表达式
                5.普通for循环
         */

        //1.接口无法直接创建对象
        //用多态方式创建对象
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        //1.迭代器遍历
        //创建迭代器对象
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }*/


        //2.增强for遍历
        //s表示集合中的每一个元素
        //下面的变量s，其实就是一个第三方的变量而已。
        //在循环的过程中，依次表示集合中的每一个元素
        /*for (String s : list) {
            System.out.println(s);
        }*/


        //3.Lambda表达式遍历
        //先写成匿名内部类形式，再改成Lambda表达式形式
        //forEach方法的形参是一个Consumer接口的实现类对象
        //forEach方法的底层其实就是一个循环遍历，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        //list.forEach(s -> System.out.println(s));


        //4.普通for
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/


        //2.列表迭代器
        //迭代器是iterator，列表迭代器是listIterator
        //创建列表迭代器对象
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String str = it.next();
            if(str.equals("BBB")){
                //额外添加了一个方法：在遍历的过程中，可以添加元素
                it.add("zzz");
                //删除"BBB
                //it.remove();
                //注意：在迭代中只能用迭代器的方法对集合进行增删，不能用集合对象.方法
                //否则会报错：并发修改异常。
            }
        }


        System.out.println(list);
    }
}
