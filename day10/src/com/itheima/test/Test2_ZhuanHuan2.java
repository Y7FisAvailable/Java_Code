package com.itheima.test;

public class Test2_ZhuanHuan2 {
    public static void main(String[] args) {
        String strA = "ABCD";
        String strB = "CDAB";

        //旋转

        //strA对比strB
        boolean flag = match(strA,strB);
        System.out.println(flag);

    }
    //定义方法，strA对比strB
    public static boolean match(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {//循环对比
            //变换后的新strA覆盖老strA,每次i++,strA必须被覆盖一次！
            strA = moveStr(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        //均不相等
        return false;
    }


    //定义方法，旋转字符串
    public static String moveStr(String str){
        //字符串转字符数组
        char[] arr = str.toCharArray();
        //取出数组的0索引元素
        char first = arr[0];
        //其他索引元素往前挪一位
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //取出的元素，放入数组最后一位
        arr[arr.length - 1] = first;

        //字符数组转会字符串
        String result = new String(arr);

        return result;
    }
}
