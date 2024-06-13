package com.itheima;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        //1.键盘录入金额
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数金额：");
        int money;
        //判断整数的合法性：0-9999999之间
        while(true){//不知道第几次输入会成功！给个死循环
            money = sc.nextInt();

            if(money >= 0 && money <= 9999999){
                break;//合法数据跳出while
            }else {
                System.out.println("非法输入，请重新输入");//输入错误后，需要再次跳转输入，输入几次会成功呢？——不知道用while
            }
        }

        //2.取出金额的每一位，数字 -> 大写汉字
        String s = "";
        while(money != 0){//2134
            int ge = money % 10;//获得个位
            s = getUpper(ge) + s;//最先取出的放在最后
            money = money / 10;//去掉获得的个位

            //循环截至条件money == 0
            }
        System.out.println(s);

        //3.补零
        int count = 7 - s.length();//补几个？
        for (int i = 0; i < count; i++) {
            s = "零" + s;
        }
        System.out.println(s);
        //4.拼写单位
        //定义单位数组
        String[] str = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        //遍历以字符串长度为末位索引
        for (int i = 0; i < s.length(); i++) {
            result = result + s.charAt(i) + str[i];
        }
        System.out.println(result);

        //5.输出打印
    }

    //定义方法，数字 -> 大写汉字
    public static String getUpper(int ge){
        //定义大写汉字表——一个字符数组
        String[] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return str[ge];
    }
}
