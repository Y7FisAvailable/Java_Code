package com.itheima;

public class test21 {
    public static void main(String[] args) {
        /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引

        */
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1.先找到无序的开头
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + i]) {
                startIndex = i + 1;
                break;
            }
        }
        //System.out.println(startIndex);//索引2

        for (int i = startIndex; i < arr.length; i++) {
            //i：表示 无序表中的第一个元素的索引，是一个位置
            //如果直接用i走代码，相当于无序表的起始索引一直在变
            int j = i;

            //无序第一个j，有序最后一个j-1
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                //完成一次交换，继续和更前面的有序表中的元素，比较，交换
                j--;
            }
            //while跳出一次，表示无序数组中的一个元素被正确的插入在有序表中。
        }

        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
