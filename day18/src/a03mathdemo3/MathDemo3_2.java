package a03mathdemo3;

public class MathDemo3_2 {
    public static void main(String[] args) {
        //水仙花数

        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);

            if (sum == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
