package com.itheima.lambdademo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //**注意点：**
        //- Lambda表达式可以用来简化匿名内部类的书写
        //- Lambda表达式只能简化函数式接口的匿名内部类的写法
        //- 函数式接口：
        //有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解

        //1.用匿名内部类的形式调用下面的方法
        //调用一个方法，如果方法的形参是一个接口，那么要传递接口的实现类对象
        //如果实现类对象只用到一次，就可以用匿名内部类的形式进行书写
        //注意：接口可以有实现类对象，接口本身无实例化

        /*method(new Swim() {
            //抽象方法的重写
            @Override
            public void swimming() {
                System.out.println("我在游泳喵~");
            }
        });*/

        method(
                () -> {
                    System.out.println("我在游泳喵~");
                }
        );

        //疑问：如果参数为空，如何知道是哪个接口呢？
        //具体调用接口1还是接口2
        //主要看method方法中形参的数据类型
        //如果形参是Swim s 则调用接口1
        //如果形参是Swim2 s 则调用接口2

        //此外，函数式接口只能有一个抽象方法，但是可以有别的成员方法

    }

    //上面new出来的匿名内部类（对象），对象被当作形参传递给method方法
    //方法中形参s调用接口中重写的抽象方法swimming
    public static void method(Swim s){
        s.swimming();
    }
}

//接口1
@FunctionalInterface
interface Swim{
    //接口的抽象方法
    public abstract void swimming();
}

//接口2
@FunctionalInterface
interface Swim2{
    //接口的抽象方法
    public abstract void swimming();
}
