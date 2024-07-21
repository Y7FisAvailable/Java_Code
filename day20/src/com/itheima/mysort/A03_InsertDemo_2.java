package com.itheima.mysort;

public class A03_InsertDemo_2 {
    public static void main(String[] args) {
        /*
            插入排序：
                将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
                遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
                N的范围：0~最大索引

        */
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1.找到有序组和无序组的界限，索引，有序的最后一个，或者无序的第一个
        //2.定义这个需要找到的索引,无序的第一个
        int startIndex = -1;

        //注意：19行arr.length不需要-1来防止索引越界
        //{1,2,3}
        //{1,3,2}
        //原因：
        //  情况1:arr进入for但不进入if，说明数组已有序，不会出现i+1出界情况
        //  情况2:arr进入for进入if，说明有无序部分，即使是最后两个元素无序，
        //数组索引范围012，最后两个索引为i=1 i+1=2，也不会越界。
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {//后一个比前一个小
                startIndex = i + 1;
                break;
            }
        }
        //System.out.println(startIndex);//2

        //3.遍历从startIndex开始的无序数组
        for (int i = startIndex; i < arr.length; i++) {

            //4.用第三方变量j记录索引i
            int j = i;

            //5.什么时候结束？不知道，用while循环
            //条件：
            //当i = j = 0时，表示对应数组的第一个元素，该元素与自己有序
            //所以起码j > 0的元素才会是无序的。
            //当数组只有一个元素，或者已经有序时，i = startIndex = j = -1
            //先判断后半部分，j=0 j-1=-1，不符合索引范围
            //在 arr[j] < arr[j - 1] && j > 0 这种顺序中，首先评估 arr[j] < arr[j - 1]。如果 j 为 0，
            //那么 arr[j - 1] 就会越界（访问 arr[-1]），导致 ArrayIndexOutOfBoundsException。
            while (j > 0 && arr[j] < arr[j - 1]) {
                //满足条件，交换位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        printArr(arr);
    }
    private static void printArr(int[] arr) {
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
