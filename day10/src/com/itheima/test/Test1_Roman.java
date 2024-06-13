package com.itheima.test;

import java.util.Scanner;

public class Test1_Roman {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str;

        //2.输入校验
        while(true){//第几次输入会成功呢？不知道，给个死循环
            str = sc.next();//1234
            boolean flag = checkStr(str);
            if(flag){
                //  成功，继续
                break;//成功，跳出整个while循环
            }else{
                //  失败，重新输入字符串
                System.out.println("输入错误，重新输入！");
                continue;//跳出本次循环，再次输入一个字符串进行判断！
            }
        }

        //3.取出字符串每个字符，对应查询表
        //遍历字符数组，每个数字转罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //取出字符
            char c = str.charAt(i);
            //字符数组转数字
            int number = c - 48;
            String result = toRoman(number);
            //拼接
            sb.append(result);
        }

        //打印
        System.out.println(sb);

        //toString
        String s = sb.toString();
        System.out.println(s);

    }
    //定义方法， 将数字与字符对应
    public static String toRoman(int number){
        //创建罗马数字的字符数组
        String[] roman = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return roman[number];
    }



    //定义方法,校验,返回结果 “是” 或者 “不是”
    public static boolean checkStr(String str){
        if(str.length() > 9){//长度>9直接不满足
            return false;
        }

        for (int i = 0; i < str.length(); i++) {//检查字符串中每个字符是否符合
            char c = str.charAt(i);
            if(c < '0' || c > '9'){//注意这里判断的是不合法情况，用的是短路或！超出一边就返回false！
                return false;
            }
        }
        return true;//当遍历完整个字符串后，才能断定校验结果！
    }
}
