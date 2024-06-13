package com.itheima.test;

public class Test6_ChengJi {
    public static void main(String[] args) {
        //1.定义两个非负整数
        String num1 = "1000";
        String num2 = "10";

        //System.out.println('0' + 0);//字符0的ascii码表对应十进制数字位48
        int integerArr1 = getInt(num1);
        int integerArr2 = getInt(num2);
        //乘积
        int intResult = integerArr1 * integerArr2;
        //int乘积转为字符串,结果前面加""即可
        String sResult = "";
        sResult += intResult;
        System.out.println(sResult);
    }
    //定义方法，把string变为int类型
    public static int getInt(String num){
        int integerArr = 0;
        for (int i = 0; i < num.length(); i++) {
            //取出每个字符
            char charNum = num.charAt(i);//比如'1'字符
            //char转int
            int intNum = charNum - 48;//1 2 3
            //得到数字串
            integerArr = integerArr * 10 + intNum;//0*10+1=1,1*10+2=12,12*10+3=123
        }
        return integerArr;
    }
}
