package com.itheima.erweishuzu;

public class erWeiShuZuDemo1 {
    public static void main(String[] args) {
        //定义二维数组
        int[][] arr = new int[3][5];
        //赋值,第二个一维数组的2索引元素
        arr[1][1] = 9;
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            //内循环结束，换行一次
            System.out.println();
        }
    }
}
