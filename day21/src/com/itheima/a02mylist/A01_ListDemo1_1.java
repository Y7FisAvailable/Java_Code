package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1_1 {
    public static void main(String[] args) {
        /*

        List系列集合独有的方法：
            void add(int index,E element)       在此集合中的指定位置插入指定的元素
            E remove(int index)                 删除指定索引处的元素，返回被删除的元素
            E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
            E get(int index)                    返回指定索引处的元素
        */

        //1.多态方式创建集合对象
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //1.void add(int index,E element)       在此集合中的指定位置插入指定的元素
        list.add(1,5);//1523



        //2.E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        //请问：此时删除的是1这个元素，还是1索引上的元素？
        //为什么？
        //因为在调用方法的时候，如果方法出现了重载现象,remove重载
        //优先调用，实参跟形参类型一致的那个方法，实参是int类型的1
        Integer remove = list.remove(1);//123
        System.out.println(remove);

        //如果要删除1元素，需要手动装箱，将对应的基本数据类型，转换成对应的包装类
        Integer integer = Integer.valueOf(list.get(1));//此时通过索引1获得元素2，删除元素2
        list.remove(integer);



        //3.E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        Integer set = list.set(0, 77);
        System.out.println(set);



        //4.E get(int index)                    返回指定索引处的元素
        Integer integer1 = list.get(1);
        System.out.println(integer1);



        System.out.println(list);
    }
}
