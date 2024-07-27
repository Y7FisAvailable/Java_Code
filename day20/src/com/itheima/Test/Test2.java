package com.itheima.Test;

public class Test2 {
    public static void main(String[] args) {
        /*
            有一个很有名的数学逻辑题叫做不死神兔问题，有一 -对兔子，从出生后第三个月起每个月都生一 对兔子，
            小兔子长到第三个月后每个月服生-一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少?
            1月: 1
            2月: 1
            3月: 2
            4月: 3
            5月: 5
            6月: 8
            特点:从第三个数据开始，是前两个数据和( 斐波那契数列)

         */

        /*
        //方法一：
        //1.定义数组存储每个月的兔子数量
        int[] arr = new int[12];
        //2.放入1月2月的
        arr[0] = 1;
        arr[1] = 1;
        //3.循环放入索引2-11的数量，每个索引的数量=该索引前两个索引上数量之和
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        //4.取出最大索引上的值
        System.out.println(arr[11]);//144*/



        //方法二：
        //累加12个月的
        System.out.println(getSum(12));

    }
    //方法二；
    //getSum(12) = getSum(11) + getSum(10)
    //getSum(11) = getSum(10) + getSum(9)
    //getSum(10) = getSum(9) + getSum(8)
    //getSum(9) = getSum(8) + getSum(7)
    //getSum(7) = getSum(6) + getSum(5)
    //...
    //getSum(3) = getSum(2) + getSum(1)
    //getSum(2) = 1
    //getSum(1) = 1

    //倒过来从getSum1 - getSum12好理解
    //递归中，递归到最后一次其实都是month1和month2在做运算
    //相当于144个1相加

    //参数：12个月
    public static int getSum(int month){
        //1月和2月都是1
        if(month == 1 || month == 2){
            //出口
            return 1;
        }
        return getSum(month - 1) + getSum(month - 2);
    }
}
