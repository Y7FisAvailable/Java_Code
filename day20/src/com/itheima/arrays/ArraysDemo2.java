package com.itheima.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //参数一:要排序的数组
        //参数二:排序的规则
        //细节:
        //只能给引用数据类型的数组进行排序
        //如果数组是基本数据类型的，需要变成其对于的包装类

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //底层原理:
        //利用插入排序+二分查找的方式进行排序的。
        //默认把0索引的数据当做是有序的序列，1索引到最后认为是无序的序列。
        //遍历无序的序列得到里面的每一个元素，假设当前遍历得到的元素是A元素
        //把A往有序序列中进行插入，在插入的时候，是利用二分查找确定A元素的插入点。
        //拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体
        //如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
        //如果方法的返回值是正数，拿着A继续跟后面的数据进行比较
        //如果方法的返回值是0，也拿着A跟后面的数据进行比较
        //直到能确定A的最终位置为止。

        //compare方法的形式参数:
        //参数一o1:表示在无序服列中，遍历得到的每一一个元素
        //参数二o2:有序序列中的元素

        //返回值:
        //负数:表示当前要插入的元素是小的，放在前面
        //正数:表示当前要插入的元素是大的，放在后面
        //0:表示当前要插入的元素跟现在的元素比是一样的们也 会放在后面

        //简单理解:
        //o1-o2:升序排列
        //o2-o1:降序排序

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {//2
                System.out.println("-------------");
                System.out.println("o1:" + o1);
                System.out.println("o2:" + o2);
                return o1 - o2;
            }
        });

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
