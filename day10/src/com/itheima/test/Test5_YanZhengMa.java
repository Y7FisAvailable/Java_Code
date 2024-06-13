package com.itheima.test;

import java.util.Random;

public class Test5_YanZhengMa {
    public static void main(String[] args) {
        //生成验证码？四位大小写字母，一位数字
        //查表法：字符数组存储大小写字母
        char[] chs = new char[52];//26*2
        //System.out.println('A' + 0);//97a 65A

        chs = cunRu(chs);
        System.out.println(chs);

        //定义字符数组，随机填充4字母,random范围
        Random r = new Random();

        char[] newChs = new char[4];
        String temp = "";
        for (int i = 0; i < newChs.length; i++) {//遍历数组newChar
            int randomIndex = r.nextInt(52);//chs数组的0-51索引
            newChs[i] = chs[randomIndex];
            temp += newChs[i];
        }
        //System.out.println(temp);//获得四位随机字母

        //随机一位数字0-9
        int number = r.nextInt(10);
        temp += number;//组合
        System.out.println(temp);//获得四位字母+一位数字

        //字符串temp->字符数组，随机交换一下末尾数字和前面4位随机一个
        char[] result = temp.toCharArray();
        int randomIndex = r.nextInt(4);//0-3
        char tempElement = result[randomIndex];
        result[randomIndex] = result[4];//0-3随机索引，接收4索引的数字
        result[4] = tempElement;
        //交换后，数组转字符串
        String result1 = new String(result);
        System.out.println(result1);
    }

    //定义方法，给数组存入A-Z和a-z
    public static char[] cunRu(char[] chs){
        for (int i = 0; i < chs.length; i++) {//0-51索引
            if(i < 26){//大写
                chs[i] = (char)(65 + i);
            }else{//小写
                chs[i] = (char)(97 - 26 + i);
            }
        }
        return chs;
    }
}
