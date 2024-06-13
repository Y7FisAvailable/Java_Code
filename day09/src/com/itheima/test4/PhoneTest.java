package com.itheima.test4;

public class PhoneTest {
    public static void main(String[] args) {
        //定义数组
        Phone[] arr = new Phone[3];

        //创建Phone类的对象p1 p2 p3
        Phone p1 = new Phone("小米",1000.0,"白色");
        Phone p2 = new Phone("华为",2000.0,"银色");
        Phone p3 = new Phone("苹果",3000.0,"红色");

        //数组存储对象
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone p = arr[i];
            sum = sum + p.getPrice();
            //System.out.println(p.getBrand() + " " +  p.getPrice() + " " + p.getColor() + " ");
        }
        double avg = sum / arr.length;
        System.out.println("平均价格是：" + avg);
    }
}
