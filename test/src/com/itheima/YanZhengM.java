package com.itheima;

import java.util.ArrayList;
import java.util.Random;

public class YanZhengM {
    public static void main(String[] args) {
        getCode();
    }
    //方法
    public static void getCode(){
        //1.定义集合用来存字母表
        ArrayList<Character> list = new ArrayList<>();
        //此时，集合list没有长度，填充26字母
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }

        //2.获取随机索引，取出集合中字母，添加到可变字符串中
        Random r = new Random();
        StringBuilder sb = new StringBuilder();//空白可变字符串
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size() - 1);//每次循环都要随机
            char c = list.get(index);
            sb.append(c);//重复四次，获得一个四字母字符串
        }

        //3.添加数字在末尾
        int number = r.nextInt(10);
        sb.append(number);

        //4.将最大索引元素（数字），和任意位置字符替换
        //可变字符串——字符串——字符数组
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length - 1);//给定随机范围！
        char temp = arr[arr.length - 1];//max元素放入temp
        arr[arr.length - 1] = arr[randomIndex];
        arr[randomIndex] = temp;

        //替换完成，字符数组——字符串
        String result = new String(arr);
        System.out.println(result);
    }
}
