package com.itheima.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
    /*
            键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
    */

        //1.键盘录入
        Scanner sc = new Scanner(System.in);

        //2.创建整数的集合
        ArrayList<Integer> list = new ArrayList<>();

        //3.循环添加整数,不知道循环次数用while
        while (true) {
            System.out.print("请输入整数:");
            String str = sc.nextLine();
            //3.1字符串转整数
            int i = Integer.parseInt(str);
            //3.2判断整数范围1-100
            if (i < 1 || i > 100) {
                System.out.println("输入有误");
                continue;
            }
            //3.3整数添加到集合
            list.add(i);
            //3.4Sum
            int sum = getSum(list);
            if(sum > 200){
                System.out.println("据和超过200");
                break;//跳出while
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            sum += num;
        }
        return sum;
    }
}
