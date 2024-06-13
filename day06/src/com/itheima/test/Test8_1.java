package com.itheima.test;

public class Test8_1 {
    public static void main(String[] args) {
        //定义原始数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //调用
        int[] result = copyOfRange(arr,0,3);//不含to：1 2 3
        //System.out.println(result);//取到的只是数组地址！
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
    //定义方法，形成新数组，返回新数组
    public static int[] copyOfRange(int[] arr,int from, int to){//from to是索引序号
        //动态初始化定义新数组
        int[] arr2 = new int[to - from];//不包含to，3个元素

        for(int i = from; i < to; i++){//遍历from到to的元素
            for(int j = 0; j < to - from; j++){
                arr2[j] = arr[i];//把老数组的元素赋值给新数组
            }
        }
        return arr2;
    }
}
//打印3 3 3 的原因：
//每次i+1次，j+3次，导致新数组0 1 2三个索引对应元素被覆盖为：1 1 1，2 2 2，3 3 3，所以输出为3 3 3
//break和continue好像都无效...


