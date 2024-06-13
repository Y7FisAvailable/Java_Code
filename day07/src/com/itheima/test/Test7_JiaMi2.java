package com.itheima.test;

public class Test7_JiaMi2 {
    public static void main(String[] args) {
        //输入一个整数，存入数组
        int number = 12345;
        int temp = number;

        //获得数组长度？
        int count = 0;
        while(number != 0){
            number = number / 10;
            count++;
        }
        //System.out.println(count);

        int[] arr = new int[count];

        //取出整数的每个数字
        int index = arr.length - 1;
        while(temp != 0){//12345
            int ge = temp % 10;//接收个位5 4 3 2 1
            //System.out.println(ge);

            //把ge填入数组
            arr[index] = ge;
            index--;

            temp = temp / 10;//接收个位后，整数去掉个位
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
