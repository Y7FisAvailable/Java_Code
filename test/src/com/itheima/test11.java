package com.itheima;

public class test11 {
    public static void main(String[] args) {
        //1.从12345中得到数字
        int number = 12345;
        int temp = number;
        int count = 0;//长度
        while(number != 0){
            number /= 10;
            count++;
        }
        //System.out.println(count);

        int[] arr = new int[count];
        int index = arr.length - 1;//最大索引=长度-1
        while(temp != 0){
            int ge = temp % 10;
            arr[index] = ge;
            index--;
            temp /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
        }

        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;//6 7 8 9 10
        }

        //%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;//6 7 8 9 0
        }

        //反转
        for (int i = 0,j = arr.length - 1; i < j; i++, j--) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j]  = temp1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");//0 9 8 7 6
        }
    }
}
