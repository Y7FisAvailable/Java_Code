package com.itheima;

import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        //产生随机验证码，要求：长度5，四个随机大小写字母 + 1位数字

        //如何随机四位字母？
        //新建字符型数组chs，放入a-z和A-Z，52个字母
        char[] chs = new char[52];//新建数组，定义长度为52
        //通过索引，遍历元素，塞入对应字母
        for (int i = 0; i < chs.length; i++) {
            //塞入小写字母
            if(i < 25){//0-25索引
                chs[i] = (char)(97 + i);//数字强转char型，就是字母
            }else{//26-51索引
                chs[i] = (char)(65 + i - 26);//65+26-26=65,即A
            }
            //System.out.print(chs[i] + " ");
        }
        //利用random随机数组的索引0-51，循环4次得到四位随机字母
        Random r = new Random();

        //接收拼接结果
        String result = "";

        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);//随机数组的范围,随机4次
            //拼接四次结果
            result += chs[randomIndex];
        }

        //利用random随机一位数字，范围0-9
        int number = r.nextInt(10);
        //拼接四位字母 + 一位数字
        result += number;
        System.out.println(result);
    }
}
