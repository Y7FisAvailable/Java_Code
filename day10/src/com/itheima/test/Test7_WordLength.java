package com.itheima.test;

public class Test7_WordLength {
    public static void main(String[] args) {
        //1.给定一个字符串，若干个单词组成
        String str = "i need you more than dope";
        //2.获取最后一个单词的长度，遇到空格字符停止
        int result = getLastWordLength(str);
        System.out.println(result);

    }
    //定义方法，获取最后一个单词长度！
    public static int getLastWordLength(String str){
        //合法性校验：单词是纯字母组成

        //反向遍历字符串，遇到第一个空格字符停止遍历，遍历次数为单词长度
        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {//长度-1是最大索引
            if(str.charAt(i) == ' '){//当i索引字符为空
                break;
            }
            count++;
        }
        return count;
    }
}
