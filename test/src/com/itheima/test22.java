package com.itheima;

public class test22 {
    public static void main(String[] args) {
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};//6-5

        quickSort(arr,0,arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //arr:要查找的数组
    //i：起始索引
    //j：结束索引
    public static void quickSort(int[] arr, int i, int j){//i , start-1
        //范围
        int start = i;
        int end = j;

        if(start > end){
            //递归出口
            return;
        }

        //基准值
        int number = arr[i];

        //当start=end，表示指向同一个元素，此时需要把该元素和基准值交换
        while(start != end){
            //end往前--
            while(true){
                if(end <= start || arr[end] < number){//end-- 和start++ 可能会出现end < start的情况
                    break;//什么情况下end停下来？————找到了
                }
                end--;//没找到，看下一个
            }
            //start往后++
            while(true){
                if(end <= start || arr[start] > number){
                    break;
                }
                start++;
            }
            //都停下了，才能执行本行代码，准备交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //一轮结束，此时end = start
        //number是基准值
        //最后换的时候是换i和start索引上的元素，与number无关
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr,i,start - 1);
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr,start + 1,j);
    }
}
