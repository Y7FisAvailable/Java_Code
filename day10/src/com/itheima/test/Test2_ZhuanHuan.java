package com.itheima.test;

public class Test2_ZhuanHuan {
    public static void main(String[] args) {
        //新建字符串strA strB
        String strA = "abcde";
        String strB = "cdeab";

        //移动strA的长度次后，字符串还原
        boolean flag = matchStr(strA,strB);
        System.out.println(flag);

    }
    //定义方法，匹配两个字符串，返回true或false
    public static boolean matchStr(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = moveStr(strA);
            if(moveStr(strA).equals(strB)){//相等返回true，不相等继续比较，str2始终不变的，每次变换需要让变换后的字符串赋值给strA
                return true;
            }
        }
        return false;
    }

    //定义方法，完成移动
    public static String moveStr(String str){
        String s = str.substring(1) + str.charAt(0);
        return s;
    }
}
