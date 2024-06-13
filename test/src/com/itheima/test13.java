package com.itheima;

import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str;//设置str为成员变量
        //数据合法性判断
        while(true){
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){//注意！flag
                break;
            }else{
                System.out.println("输入错误，重新输入！");
                continue;
            }
        }

        //数据的每个元素，进行转为罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String result = toRoman(c);
            //取出后进行拼接
            sb.append(result);
        }
        System.out.println(sb);
    }
    //定义方法，数字转罗马
    public static String toRoman(char number){
        String str = switch (number){
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };
        return str;
    }

    //定义方法，合法性判断
    public static boolean checkStr(String str){
        //1.判断长度小于9
        if(str.length() > 9){
            return false;
        }

        //2.只能是数字，因为是字符数字，所以用ascii码表转换思想，找字符数字0-9的对应十进制范围
        //首先需要遍历字符数组，拿出每个字符进行判断
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        //结束遍历后，才能判定该字符数组，符合要求
        return true;
    }
}
