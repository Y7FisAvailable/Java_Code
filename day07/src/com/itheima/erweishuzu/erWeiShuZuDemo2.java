package com.itheima.erweishuzu;

public class erWeiShuZuDemo2 {
    public static void main(String[] args) {
        int[][] yearArrArr = {
                {11,22,33},
                {12,22,33},
                {14,22,33},
                {165,22,33}
        };

        //调用
        int yearsum = 0;
        for(int i = 0; i < yearArrArr.length; i++){
            //i是二维数组的索引
            //yearArrArr[i]才是元素（一维数组）
            int[] temp = yearArrArr[i];
            int tempSum = getSum(temp);
            System.out.println("第" + (i+1) + "季度营业额为：" + tempSum);
            yearsum += tempSum;
        }
        System.out.println("全年为" + yearsum);

    }

    //季度sum,需要一维数组arr
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
