package com.itheima.test;

import java.util.Random;

public class Test3_YanZhengMa {
    public static void main(String[] args) {
        //产生随机验证码，要求：长度5，四个随机大小写字母 + 1位数字

        //新建数组，放入全部大小写字母
        char[] chs = new char[52];//长度52

        //遍历数组，塞入字母
        for (int i = 0; i < chs.length; i++) {
            if(i <= 25){//前26个元素，塞入小写字母
                chs[i] = (char)(97 + i);
            }else{//后26个元素，塞入大写字母
                chs[i] = (char)(65 + i - 26);
            }
            //System.out.print(chs[i]);
        }
        //调用random类，循环4次，产生前四个
        Random r = new Random();
        //随机抽取,循环4次
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);//随机范围
            result = result + chs[randomIndex];
        }
        //System.out.println(result);//随机4位字母
        //从0-9产生1个数字
        int number = r.nextInt(10);//数字0-9
        //拼接四位 + 一位
        result += number;
        System.out.println(result);
    }
}
