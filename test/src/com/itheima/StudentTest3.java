package com.itheima;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest3 {
    public static void main(String[] args) {
        //定义集合，用来存储用户对象
        ArrayList<Student3> list = new ArrayList<>();

        //复用
        loop1: while(true){
            //键盘录入选择
            Scanner sc = new Scanner(System.in);
            System.out.println("--------欢迎来到学生管理系统---------");
            System.out.println("1-登录  2-注册  3-忘记密码");
            System.out.print("请选择您的操作：");
            String choose = sc.next();

            switch (choose){
                case "1" -> {
                    //登录
                    logIn(list);
                }
                case "2" -> {
                    //注册
                    signUp(list);
                }
                case "3" -> {
                    //忘记密码
                    forgotPWD(list);
                }
                case "4" -> {
                    //退出系统
                    break loop1;
                }
                default -> {
                    //没有这个选项，请重新输入
                    System.out.println("没有这个选项，请重新输入!");
                }
            }
        }
    }



    //登录方法，后登录
    public static void logIn(ArrayList<Student3> list){
        System.out.println("logIn");
    }


    //注册方法，先注册
    public static void signUp(ArrayList<Student3> list){
        //创建用户对象， 用来放入校验后的属性
        Student3 stu = new Student3();

        //输入用户名
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = sc.next();

        //1.用户名唯一，输入的username和集合中用户的username对比
        boolean flag = uniquenessUsername(list,username);

        //2.用户名长度3-15，一个if语句
        if(flag){
            int usernameLength = stringLength(username);//得到用户名长度
            if(usernameLength < 3 || usernameLength > 15){
                //本行代码执行，表示长度合法，下面判断字母数字组合

                int count = charAndNum(username);//返回值为字母个数

                //再判断字母数量>=1，即要求：字母个数>=1，<=username.length - 1
                //合法，把username放入对象中，对象封装完成后，再放入集合中
                if(count < 1 || count == username.length()){
                    System.out.println("用户名字符不合法！");
                }else {
                    //合法,把录入的username放入对象的username中
                    stu.setUsername(username);
                }
            }else{
                System.out.println("用户名长度不合法！");
            }
        }


        //3.字母+数字，取出每个字符，判断字符在a-z A-Z 0-9之间，并且字母数量>=1
        //用了方法实现


        //4.两次密码对比，录入一次存储，录入两次存储，equals对比
        System.out.println("请输入密码：");
        String password1 = sc.next();
        System.out.println("请再次输入密码：");
        String password2 = sc.next();
        if(password1.equals(password2)){
            //相等，把密码填入对象
            stu.setPassword(password1);
        }else {
            //不相等
            System.out.println("两次的密码输入不一致！");
        }

        //5.身份证验证
    }


    //忘记密码，最后忘记密码
    public static void forgotPWD(ArrayList<Student3> list){
        System.out.println("forgotPWD");
    }


    //方法，用户名唯一
    public static boolean uniquenessUsername(ArrayList<Student3> list,String username){
        //遍历集合，取出用户的用户名进行对比，并且返回
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).getUsername();
            if(username.equals(str)){
                System.out.println("该用户名存在！");
                return false;
            }
        }
        //遍历结束用户名不相等，不存在，可以注册
        return true;
    }


    //方法，判断用户名长度合法3-15,应该是判断长度！而不是判断长度后再判断合法性
    public static int stringLength(String str){
        int length = str.length();
        return length;
    }


    //方法，用户名必须字母+数字组合，取出每个字符，判断字符在a-z A-Z 0-9之间
    //再字母数量>=1，即字母个数>=1，<=username.length - 1
    public static int charAndNum(String username){
        //设置计数器判断字母个数
        int count = 0;
        //遍历字符串
        loop2: for (int i = 0; i < username.length(); i++) {
            char chs = username.charAt(i);//取出每个字符
            if((chs >= 'a' && chs <= 'z')||(chs >= 'A' && chs <= 'Z')||(chs >= '0' && chs <= '9')){
                if((chs >= 'a' && chs <= 'z')||(chs >= 'A' && chs <= 'Z')){
                    count++;
                }
            }else{
                System.out.println("用户名字符不合法！");
                count = -1;//这里覆盖了count
                break loop2;//出现一个不合法，直接跳出整个username的循环，跳出循环，返回值怎么办？
            }
        }
        //返回字母个数
        return count;
    }
}
