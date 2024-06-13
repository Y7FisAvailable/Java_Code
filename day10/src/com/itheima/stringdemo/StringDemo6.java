package com.itheima.stringdemo;

public class StringDemo6 {
    public static void main(String[] args) {
        //定义int数组
        int[] arr = {1,2,3};
        String str = getStringArr(arr);
        System.out.println(str);

    }
    //定义方法，取出int数组中元素，拼接成字符串返回
    //需要，int数组，需要，返回值
    public static String getStringArr(int[] arr){
        //安全校验
        //1.数组为null
        if(arr == null){
            return "";
        }
        //2.数组长度为0
        if(arr.length == 0){
            return "[]";
        }
        //3.表示数组不为null，也不为0
        //遍历int类型数组，对应i索引元素，放入字符数组中,字符和数字的对应关系？——ASCII？
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            //先取出数字类型，拼接一个空字符，形成字符串，然后将字符串存入字符数组中！
            if(i == 2){
                result = result + arr[i];//最后一个元素后，不加“，”
            }else{
                result = result + arr[i] + ',';//不是最后一个元素，都加“，”
            }
        }
        //遍历结束，给result加上 “ ] ”
        result = result + "]";
        return result;
    }
}
