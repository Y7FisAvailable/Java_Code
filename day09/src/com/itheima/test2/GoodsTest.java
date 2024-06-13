package com.itheima.test2;

public class GoodsTest {
    public static void main(String[] args) {
        //定义Goods类型数组arr
        //int[] arr = new int[3];
        Goods[] arr = new Goods[3];

        //利用Goods类创建对象g1 g2 g3，并且放入参数
        Goods g1 = new Goods("001","利群",15.00,100);
        Goods g2 = new Goods("002","打火机",2.00,50);
        Goods g3 = new Goods("003","火柴",0.1,20);

        //添加商品对象到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //int goods = arr[i];
            //System.out.println(goods);

            Goods goods = arr[i];
            //System.out.println(goods);//只能接收到地址值
            System.out.println(goods.getId());
            System.out.println(goods.getName());
            System.out.println(goods.getPrice());
            System.out.println(goods.getCount());
        }
    }
}
