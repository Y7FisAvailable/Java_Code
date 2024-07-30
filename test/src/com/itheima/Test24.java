package com.itheima;

public class Test24 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        String s = list.get(1);
        System.out.println(s);

        boolean delete = list.delete("aaa");
        System.out.println(delete);
        System.out.println(list);

    }
}
