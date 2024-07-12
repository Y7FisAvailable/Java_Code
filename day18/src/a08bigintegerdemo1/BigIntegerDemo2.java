package a08bigintegerdemo1;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        /*
            public BigInteger add(BigInteger val) 加法
            public BigInteger subtract(BigInteger val) 减法
            public BigInteger multiply(BigInteger val) 乘法
            public BigInteger divide(BigInteger val) 除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
            public boolean equals(Object x) 比较是否相同
            public BigInteger pow(int exponent) 次幂
            public BigInteger max/min(BigInteger val) 返回较大值/较小值
            public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误
        */

        BigInteger bd1 = new BigInteger("100");
        BigInteger bd2 = BigInteger.valueOf(10);
        BigInteger bd3 = BigInteger.valueOf(5);

        //加法
        System.out.println(bd2.add(bd3));//15
        //减法
        System.out.println(bd2.subtract(bd3));//5
        //乘法
        System.out.println(bd1.multiply(bd2));//1000
        //取商
        System.out.println(bd1.divide(bd2));//10
        //取商取余
        BigInteger[] bigIntegers = bd2.divideAndRemainder(bd3);
        System.out.println(bigIntegers[0]);//2
        System.out.println(bigIntegers[1]);//0
        //equals
        System.out.println(bd1.equals(bd2));//false
        //次幂
        BigInteger pow = bd1.pow(2);
        System.out.println(pow);//10000
        //max min
        BigInteger max = bd1.max(bd2);
        System.out.println(max);//100
        //转int
        BigInteger bd4 = BigInteger.valueOf(100000000000L);
        int i = bd4.intValue();
        System.out.println("," + i);//,1215752192

        /*//1.创建两个BigInteger对象
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        //2.加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //3.除法，获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //4.比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //5.次幂
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        //6.max
        BigInteger bd5 = bd1.max(bd2);


        //7.转为int类型整数，超出范围数据有误
        *//* BigInteger bd6 = BigInteger.valueOf(2147483647L);
         int i = bd6.intValue();
         System.out.println(i);
         *//*

        BigInteger bd6 = BigInteger.valueOf(200);
        double v = bd6.doubleValue();
        System.out.println(v);//200.0*/
    }
}
