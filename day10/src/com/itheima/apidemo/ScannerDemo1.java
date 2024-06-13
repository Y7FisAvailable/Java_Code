package com.itheima.apidemo;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //构造方法，一个Scanner类，对象名为sc
        Scanner sc = new Scanner(System.in);
        //方法
        double result = sc.nextDouble();//ctrl + alt + v 自动生成左边
        System.out.println(result);
    }
}
