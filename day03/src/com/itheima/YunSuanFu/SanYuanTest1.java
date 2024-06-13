package com.itheima.YunSuanFu;

import java.util.Scanner;

public class SanYuanTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the first:");
        double num1 = sc.nextInt();
        System.out.println("the second:");
        double num2 = sc.nextInt();
        String result = num1 == num2 ? "相同" : "不同" ;
        System.out.println(result);
    }
}
