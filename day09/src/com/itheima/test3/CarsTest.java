package com.itheima.test3;

import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args) {
        //定义数组
        Cars[] arr = new Cars[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建空参对象
            Cars c = new Cars();
            //给对象录入数据
            System.out.print("输入品牌");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.print("输入价格");
            double price = sc.nextInt();
            c.setPrice(price);

            System.out.print("输入颜色");
            String color = sc.next();
            c.setColor(color);

            //将汽车对象，添加数组
            arr[i] = c;//c是对象
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Cars cars = arr[i];//数组中的元素是每个car对象，取出对应索引下元素，交给Cars类的变量
            System.out.println(cars.getBrand() + "," + cars.getPrice() + "," + cars.getColor());
        }
    }
}
