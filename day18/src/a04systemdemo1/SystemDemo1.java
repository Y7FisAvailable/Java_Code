package a04systemdemo1;

public class SystemDemo1 {
    public static void main(String[] args) {
        System.out.println("exit--------------------");
        //静态直接类名.方法名调用
        //形参：
        //0：JVM正常停止
        //非0：异常停止
        //System.exit(0);

        System.out.println("currentTimeMillis--------------------");
        //获取从1970-1-1 00.00.00到现在的时间（毫秒）
        long l = System.currentTimeMillis();
        System.out.println(l);//1720607776111

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            boolean flag = isPrime2(i);
            if (flag) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        //得到时间差,响应速度
        System.out.println(end - start);//isPrime1 750ms
        //isPrime2 22ms

        System.out.println("arraycopy--------------------");
        //拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //把arr1数组数据拷贝到arr2中
        //参数1：数据源，要拷贝的数据从哪个数组来？
        //参数2：从数据源数组的第几个索引开始拷贝？
        //参数3：目的地，要把数组拷贝到哪个数组中？
        //参数4：目的地数组的索引
        //参数5：拷贝的元素个数
        //System.arraycopy(arr1, 0, arr2, 0, 10);

        //验证：
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");//1 2 3 4 5 6 7 8 9 10
        }*/

        //ex1.arr2 = 0 0 0 0 1 2 3 0 0 0
        //System.arraycopy(arr1,0,arr2,4,3);
        //验证：
        /*for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");//1 2 3 4 5 6 7 8 9 10
        }*/

        //ex2.arr2 = 0 0 7 8 9 0 0 0 0 0
        System.arraycopy(arr1,6,arr2,2,3);
        //验证：
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");//1 2 3 4 5 6 7 8 9 10
        }

        //补充：
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者类型必须一致，否则报错
        //2.拷贝中，需要考虑数组长度，如果超出长度，否则报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型

    }

    //老方法，找质数
    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //新方法sqrt
    public static boolean isPrime2(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
