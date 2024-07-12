package a09bigdecimaldemo1;

import java.math.BigDecimal;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        /*
            1.public BigDecimal add(BigDecimal val) 加法
            2.public BigDecimal subtract(BigDecimal val) 减法
            3.public BigDecimal multiply(BigDecimal val) 乘法
            4.public BigDecimal divide(BigDecimal val) 除法        【注意：当除不尽的时候，该方法会报错，此时只能用方法5设置精确几位、舍入模式】
            5.public BigDecimal divide(BigDecimal val，精确几位，舍入模式)除法
        */
        //1.加法
        BigDecimal bd1 = BigDecimal.valueOf(0.226);
        /*BigDecimal bd2 = BigDecimal.valueOf(2.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        //2.减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        //3.乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);//20.00

        //4.除法
        //舍入模式：RoundingMode.HALF_UP，四舍五入
        //其他舍入模式可以查询api帮助文档
        BigDecimal bd6 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(bd6);//3.33*/
    }
}
