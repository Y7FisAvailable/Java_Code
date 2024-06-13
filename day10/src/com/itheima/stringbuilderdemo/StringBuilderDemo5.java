package com.itheima.stringbuilderdemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3};
        String result = arrToString(arr);
        System.out.println(result);
    }
    //定义方法，数组元素拼接为字符串返回
    public static String arrToString(int[] arr){
        //定义sb对象
        StringBuilder sb = new StringBuilder();
        //拼接左括号
        sb.append("[");
        //遍历数组，拼接里面的元素
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i] + ",");
            }
        }
        //最后拼接右括号
        sb.append("]");
        //toString
        return sb.toString();
    }
}
