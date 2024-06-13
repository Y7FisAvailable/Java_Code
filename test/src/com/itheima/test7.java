package com.itheima;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        //录入税前工资
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入税前工资：");
        double shuiQian = sc.nextInt();

        //计算三险一金：10%
        double sanXian = 0.1 * shuiQian;

        //判断税前 - 三险一金后是否大于5000？
        //  小于5000，结束，不交税
        if((shuiQian - sanXian) < 5000){
            System.out.println("不用交税" + "工资" + (shuiQian - sanXian));

        }else if((shuiQian - sanXian) >= 5000){//  大于5000，计算交税
            double jiaoShuiBuFen = (shuiQian - sanXian) - 5000;//部分5000
            double shui = 0;

            if(jiaoShuiBuFen <= 3000){
                shui = jiaoShuiBuFen * 0.03;//0-3000

            }else if(jiaoShuiBuFen > 3000 && jiaoShuiBuFen <= 12000){
                shui = 90 + (jiaoShuiBuFen - 3000) * 0.1;//3000-12000

            }else if(jiaoShuiBuFen > 12000 && jiaoShuiBuFen <= 25000){//12000-25000
                shui = 90 + 1200 + (jiaoShuiBuFen - 15000) * 0.2;

            }else if(jiaoShuiBuFen > 25000 && jiaoShuiBuFen <= 35000){//25000-35000
                shui = 90 + 1200 + 5000 + (jiaoShuiBuFen - 40000) * 0.25;

            }else if(jiaoShuiBuFen > 35000 && jiaoShuiBuFen <= 55000){//35000-55000
                shui = 90 + 1200 + 5000 + 8750 + (jiaoShuiBuFen - 75000) * 0.30;

            }else if(jiaoShuiBuFen > 55000 && jiaoShuiBuFen <= 80000){//55000-80000
                shui = 90 + 1200 + 5000 + 8750 + 16500 + (jiaoShuiBuFen - 130000) * 0.35;

            }else{
                shui = 90 + 1200 + 5000 + 8750 + 16500 + 28000 + (jiaoShuiBuFen - 210000) * 0.45;
            }
            //税后：税前 - 交税
            System.out.println("税后工资为："+ (shuiQian - sanXian - shui));
        }
    }
}
