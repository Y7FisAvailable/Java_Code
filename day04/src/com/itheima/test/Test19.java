package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
        int beiChu = 20;
        int chu = 3;
        //商，就是循环次数
        int shang = 0;

        //当被除不大于除数时，即为余数
        while(beiChu >= chu){
            beiChu = beiChu - chu;
            shang++;
        }
        System.out.println("商为：" + shang);
        System.out.println("余数为：" + beiChu);
    }
}
