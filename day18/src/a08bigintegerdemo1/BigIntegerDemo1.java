package a08bigintegerdemo1;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        /*
            1.public BigInteger(int num, Random rnd) 获取随机大整数，范围:[0~ 2的num次方-11
            2.public BigInteger(String val) 获取指定的大整数
            3.public BigInteger(String val, int radix) 获取指定进制的大整数

            4.public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化

            细节:
            5.对象一旦创建里面的数据不能发生改变。

            常用为2、4，长度在long范围内常用4
        */

        //1.获取随机大整数
        /*for (int i = 0; i < 3; i++) {
            BigInteger bi1 = new BigInteger(3,new Random());
            System.out.println(bi1);//[0 - 7]
        }*/

        //2.获取指定的大整数
        //细节：字符串必须是整数，否则报错
        /*BigInteger bi2 = new BigInteger("9999999999999999");
        BigInteger bi3 = new BigInteger("1.1");//不是整数
        System.out.println(bi2);
        System.out.println(bi3);*/

        //3.获取指定进制的大整数
        //细节：
        //1.必须整数
        //2.必须和进制吻合，比如2进制只有01
        /*BigInteger bi4 = new BigInteger("100",10);
        System.out.println(bi4);*/

        //4.静态方法获取BigInteger的对象，内部有优化
        //细节：
        //1.valueOf能表示的范围小，只能在long范围内，超出报错
        //  valueOf的底层代码其实是BigInteger(String val)
        //2.在内部对常用数字：-16 ~ 16 进行优化
        //  提前把-16 ~ 16 创建了BigInteger对象
        //  需要的时候直接通过地址值调用，而不是重新创建
        BigInteger bi5 = BigInteger.valueOf(1000);
        BigInteger bi6 = BigInteger.valueOf(1000000000000000L);//默认int，过长要L
        System.out.println(bi5);
        System.out.println(bi6);

        BigInteger bi7 = BigInteger.valueOf(16);
        BigInteger bi8 = BigInteger.valueOf(16);
        System.out.println(bi7 == bi8);//true


        BigInteger bi9 = BigInteger.valueOf(17);
        BigInteger bi10 = BigInteger.valueOf(17);
        System.out.println(bi9 == bi10);//false

        BigInteger bi11 = new BigInteger("16");
        System.out.println(bi7 == bi11);//false

        //5.对象一旦创建里面的数据不能发生改变
        BigInteger bi12 = BigInteger.valueOf(1);
        BigInteger bi13 = BigInteger.valueOf(2);
        BigInteger result = bi12.add(bi13);
        System.out.println(result);//3
        //计算不会修改参与计算的BigInteger对象的值，
        //而是创建了个新的BigInteger存放结果result

    }
}
