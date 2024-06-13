package com.itheima.test;

public class Test17 {
    public static void main(String[] args) {
        double houDu = 0.1;
        double shanFeng = 8844430;
        int ciShu = 0;
        while(houDu <= shanFeng){
            houDu += houDu;
            ciShu++;
        }
        System.out.println(ciShu);
    }
}
