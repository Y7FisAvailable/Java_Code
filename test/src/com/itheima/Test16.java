package com.itheima;

public class Test16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {//Index 5 out of bounds for length 5
                break;
            }
        }
    }
}
