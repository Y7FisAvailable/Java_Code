package a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {

        System.out.println("---------------------绝对值");
        //[abs绝对值]
        System.out.println(Math.abs(-88));//88
        System.out.println(Math.abs(88));//88
        //bug：
        //int范围：-2147483648 ~ 2147483647
        //如果没有正数与负数对应，传递结果会报错
        System.out.println(Math.abs(-2147483648));//-2147483648
        //absExact抛出异常
        //Overflow to represent absolute value of Integer.MIN_VALUE
        //System.out.println(Math.absExact(-2147483648));

        System.out.println("---------------------向上取整");

        //[ceil向上取整]往右最近的一个整数
        System.out.println(Math.ceil(12.11));//13.0
        System.out.println(Math.ceil(12.66));//13.0
        System.out.println(Math.ceil(-12.11));//-12.0
        System.out.println(Math.ceil(-12.66));//-12.0

        System.out.println("---------------------向下取整");

        //[floor向下取整]往左最近的一个整数
        System.out.println(Math.floor(12.11));//12.0
        System.out.println(Math.floor(12.66));//12.0
        System.out.println(Math.floor(-12.11));//-13.0
        System.out.println(Math.floor(-12.66));//-13.0

        System.out.println("---------------------次幂和开方");

        //a的b次幂
        System.out.println(Math.pow(2,3));//8.0
        //细节：
        //如果第二个参数是0-1之间的小数，结果为开平方
        System.out.println(Math.pow(4,0.5));//2.0
        System.out.println(Math.pow(2,-2));//0.25
        //拓展：开平方sqrt，开立方cbrt
        System.out.println(Math.sqrt(4));//2.0
        System.out.println(Math.cbrt(8));//2.0

        System.out.println("---------------------四舍五入");

        //round四舍五入
        System.out.println(Math.round(1.3));//1.0
        System.out.println(Math.round(1.5));//2.0

        System.out.println(Math.round(-1.3));//-1.0，负数时，小数>=-0.5，向上取整（近0）
        System.out.println(Math.round(-1.5));//-1.0
        System.out.println(Math.round(-1.54));//-2.0，负数时，小数<-0.5，向下取整（远0）

        System.out.println(Math.round(-12.34));//-12
        System.out.println(Math.round(-12.54));//-13

        System.out.println("---------------------max min");

        //两个数中最大值max,最小值min
        System.out.println(Math.max(20, 30));//30
        System.out.println(Math.min(20, 30));//20

        System.out.println("---------------------随机数");

        //random[0.0 - 1.0)的随机数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
            //System.out.println(Math.floor(Math.random() * 100) + 1);
            //Math.random() [0.0 - 1.0)
            // * 100        [0.0 - 100.0)
            // floor        去掉后面小数
            // + 1          [0.0 - 100.0]
        }

    }
}
