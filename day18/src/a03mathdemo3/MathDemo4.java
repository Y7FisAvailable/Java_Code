package a03mathdemo3;

public class MathDemo4 {
    public static void main(String[] args) {
        //水仙花数：范围：三位数，100-999之间的
        //1.遍历100-999的数字
        //2.每个数字获取个、十、百位数字
        //3.开幂次，相加 == 这个数，则为水仙花数

        //证明两位无自幂数

        int count = 0;
        boolean flag = false;
        for (int i = 10; i <= 99; i++) {
            int sum = getN(i);
            if(sum == i){
                count++;
                System.out.println(sum);
                flag = true;
            }
        }
        if(flag){
            System.out.println("一共有" + count + "个");
        }else {
            System.out.println("此范围内无自幂数");
        }

    }

    public static int getN(int i) {//15
        int sum = 0;
        for (int j = 0; j < 2; j++) {
            double n = (int)(i / Math.pow(10, j) % 10);//5，1
            sum += (int)(Math.pow(n, 3));//125，126
        }
        return sum;
    }
}
