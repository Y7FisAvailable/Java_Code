package com.itheima.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //1.创建StringBuilder对象
        StringBuilder sb = new StringBuilder("abc");

        sb.append("def");
        sb.append("ghi");

        System.out.println(sb);//abcdefghi
        //此时的sb是StringBuilder类的对象，不是字符串对象

        String str = sb.toString();
        //转成String后就可以用字符串的成员方法了！
        //比如：str.charAt()、str.substring()
    }
}
