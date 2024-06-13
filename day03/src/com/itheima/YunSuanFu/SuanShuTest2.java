package com.itheima.YunSuanFu;

import java.util.Scanner;

public class SuanShuTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入三位整数：");

        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位数是：" + ge);
        System.out.println("十位数是：" + shi);
        System.out.println("百位数是：" + bai);
    }
}
