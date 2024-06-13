package com.itheima.test;

public class HuiWenShu_Test18 {
    public static void main(String[] args) {
        //核心思想是：用正的==反的，ok就行
        //1.假定X=1234
        int x = 1234;

        //用于和f比较
        int tempx = 1234;

        //5.接收反过来的数字们
        int f = 0;

        //2.反过来取出x,取1次、取2次、取3次...
        //所以需要用到循环
        //循环选择，知道取几次？不知道——用while
        while(x != 0){
            //3.取个位
            int ge = x % 10;//4 3 2 1

            //4.个位取出，放到最左边，组成反过来的数字，定义新变量接收
            f = f * 10 + ge;//04 43 432 4321

            //6.该让1234变成123了
            x = x / 10;//123 12 1 0
        }
        System.out.println(f == tempx);//新数字和老数字对比，但是由于x在多次循环最终=0，故提前定义新变量tempx为最初x的值
    }
}
