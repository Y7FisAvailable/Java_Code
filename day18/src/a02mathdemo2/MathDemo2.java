package a02mathdemo2;

public class MathDemo2 {
    public static void main(String[] args) {
        isPrime(997);
    }

    /*
    老写法
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            //质数：除了1和本身外无因子
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(number + "是质数");
        return true;
    }*/

    public static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            //质数：除了1和本身外无因子
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println(count);
        System.out.println(number + "是质数");
        return true;
    }
}
