package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //定义正确的用户名 密码
        String rightusername = "zhangsan";
        String rightpassword = "123456";

        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {//i = 0 1 2
            System.out.print("请输入用户名：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();

            //对比
            if((rightusername.equals(username)) && (rightpassword.equals(password))){
                System.out.println("用户登录成功！");
                break;//为什么要加break?——break直接跳出for循环不再进行i++操作！

            }else{
                if(i == 2){//当i=2，说明最后一次也没有输入正确，账号锁定
                    System.out.println("您的账户" + username +"已锁定！");
                }
                System.out.println("您的用户名或密码错误！" + "您还有" + (2 - i) + "次机会！");
            }
        }
    }
}
