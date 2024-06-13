package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.next();

        //遍历字符串
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {//str.length()表示字符串的长度
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){//当char类型运算时，会自动提升到int类型，所以查的是字符a-z的ASCII码表
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){//同理查码表
                bigCount++;
            }else if(c >= '0' && c <= '9'){//需要注意：数字0-9和字符0-9在ASCII码表中，不是一回事！
                numberCount++;
            }
        }
        System.out.println("大写字母共有：" + bigCount + "个");
        System.out.println("小写字母共有：" + smallCount + "个");
        System.out.println("数字字符共有：" + numberCount + "个");
    }
}
