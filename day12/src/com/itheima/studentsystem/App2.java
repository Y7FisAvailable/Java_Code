package com.itheima.studentsystem;
//2107

import java.util.ArrayList;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<User2> list = new ArrayList<>();

        //登录界面
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1-登录  2-注册  3-忘记密码  4-退出");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入你的操作：");
            String choose = sc.next();//next比nextInt适配更高

            switch (choose){
                case "1" -> {
                    login(list);
                }
                case "2" -> {
                    signUp(list);
                }
                case "3" -> {
                    forgotPWD(list);
                }
                case "4" -> {
                    System.out.println("感谢您的使用，再见！");
                    System.exit(0);
                }
                default -> {
                    System.out.println("没有这个选项，请重新输入！");
                }
            }
        }
    }

    private static void login(ArrayList<User2> list) {
        System.out.println("登录");
    }

    private static void signUp(ArrayList<User2> list) {
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.print("请输入用户名：");
            username = sc.next();
            boolean flag1 = checkUsername(username);
            if(!flag1){
                System.out.println("用户名有误，重新输入！");
                continue;
            }

            //用户名唯一
            boolean flag2 = uniquenessUsername(list,username);
            if(flag2){
                System.out.println("用户名合法，请继续输入其他数据！");
                break;
            }else{
                System.out.println("用户名已存在，重新输入！");
                continue;
            }
        }

        //2.两次密码对比
        String password;
        while (true) {
            System.out.print("请输入密码：");
            password = sc.next();
            System.out.print("请再次输入密码：");
            String againPassword = sc.next();
            if(password.equals(againPassword)){
                System.out.println("两次密码一致，请继续输入其他数据！");
                break;
            }else{
                System.out.println("两次密码不一致，请重新输入！");
                continue;
            }
        }

        //3.录入身份证
        String idNumber;
        while (true) {
            System.out.print("请输入身份证号码：");
            idNumber = sc.next();
            boolean flag3 = checkIdNumber(idNumber);
            if(flag3){
                System.out.println("身份证号码合法，请继续输入其他数据！");
                break;
            }else {
                System.out.println("身份证号码非法，请重新输入");
                continue;
            }
        }

        //4.录入手机号
        String phoneNumber;
        while (true) {
            System.out.print("请输入手机号：");
            phoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(phoneNumber);
            if(flag4){
                System.out.println("手机号合法！");
                break;
            }else {
                System.out.println("手机号非法，请重新输入！");
                continue;
            }
        }

        //5.属性存入对象，对象存入集合
        User2 user = new User2(username,password,idNumber,phoneNumber);
        list.add(user);
        System.out.println("注册成功！");

        //验证注册成功，遍历集合
        printList(list);
    }

    private static void printList(ArrayList<User2> list) {
        for (int i = 0; i < list.size(); i++) {
            User2 user = list.get(i);
            System.out.println(user.getUsername() + "," +user.getPassword() + "," +user.getIdNumber() + "," +user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度11
        int len = phoneNumber.length();
        if(len != 11){
            return false;
        }

        //不能0开头
        boolean result = phoneNumber.startsWith("0");
        if(result){
            return false;
        }

        //都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIdNumber(String idNumber) {
        //长度18
        int len = idNumber.length();
        if(len != 18){
            return false;
        }

        //不能0开头
        boolean result = idNumber.startsWith("0");
        if(result){
            return false;
        }

        //前17数字,遍历字符串，前17的范围是'0'-'9',前17位索引是0-16
        for (int i = 0; i < idNumber.length() - 1; i++) {
            char c = idNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }

        //最后一位数字、X、x
        char endChar = idNumber.charAt(idNumber.length() - 1);
        if(!((endChar >= '0' && endChar <= '9')||(endChar == 'X')||(endChar == 'x'))){
            return false;
        }
        return true;
    }

    private static boolean uniquenessUsername(ArrayList<User2> list,String username) {
        for (int i = 0; i < list.size(); i++) {
            User2 user = list.get(i);
            if(user.getUsername().equals(username)){
                return false;
            }
        }
        return true;//都不相等
    }

    private static boolean checkUsername(String username) {
        //长度3-15
        int len = username.length();
        if(!(len >= 3 && len <= 15)){
            return false;
        }

        //字母+数字,即username每个字符在a-z A-Z 0-9之间，一个不在返回false
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9'))){
                return false;
            }
        }

        //不能纯数字,即至少有一个字母，记录字母个数，当个数>0时，则合法
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
                count++;//当count>0，则合法，不用继续循环
                break;
            }
        }
        return count > 0;
    }

    private static void forgotPWD(ArrayList<User2> list) {
        System.out.println("忘记密码");
    }
}
