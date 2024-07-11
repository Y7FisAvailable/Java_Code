package a03mathdemo3;

public class MathDemo3 {
    public static void main(String[] args) {
        //水仙花数：范围：三位数，100-999之间的
        //1.遍历100-999的数字
        //2.每个数字获取个、十、百位数字
        //3.开幂次，相加 == 这个数，则为水仙花数

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int sum = getN(i);
            if(sum == i){
                count++;
                System.out.println(sum);
            }
        }
        System.out.println("一共有" + count + "个");
    }

    public static int getN(int i) {//153
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            int n = (int)(i / Math.pow(10, j) % 10);//3,5,1
            sum += (int)(Math.pow(n, 3));//27,152,153
        }
        return sum;
    }
}
