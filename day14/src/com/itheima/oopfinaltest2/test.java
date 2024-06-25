package com.itheima.oopfinaltest2;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }
    //生成验证码
    private static String getCode(){
        //定义集合，存入a-z A-Z
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {//字母个数为26

            list.add((char)('a' + i));//i为索引，开始是0；'a' + i = 97,强转结果为'a'
            list.add((char)('A' + i));//大写字母
        }

        //抽4个字符，获取随机索引,生成长度为4的字母字符串
        StringBuilder sb = new StringBuilder();//创建空白sb对象
        Random r = new Random();//创建随机数

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());////范围是0-51索引
            char c = list.get(index);
            sb.append(c);
        }

        //随机数字添加末尾
        int number = r.nextInt(10);
        sb.append(number);

        //sb转字符串转字符数组，交换索引，实现数字在任意位置
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        //字符数组转字符串
        String result = new String(arr);

        return result;
    }
}
