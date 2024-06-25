package com.itheima.oopfinaltest1;

public class finaldemo1 {
    public static void main(String[] args) {
        final int i = 10;
        //i = 20;

        final int[] arr = {1,2,3,4,5};
        arr[0] = 10;
        arr[1] = 20;
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }
}
