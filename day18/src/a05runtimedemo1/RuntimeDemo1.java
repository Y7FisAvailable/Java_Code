package a05runtimedemo1;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取当前系统运行环境的对象
        Runtime r = Runtime.getRuntime();

        //2.停止虚拟机，0正常停止，非0异常停止
        //r.exit(0);
        //Runtime.getRuntime().exit(1);

        //3.获取CPU线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//16

        //4.JVM能从系统中获取总内存大小-byte
        /*    1Byte（字节）=8b（位）
              1 KB = 1024 B
              1 MB = 1024 KB
              1 GB = 1024 MB
              1TB = 1024GB        */
        System.out.println("总内存大小"+Runtime.getRuntime().maxMemory()/1024/1024);//4032MB

        //5.JVM已经从系统中获取总内存大小-byte
        System.out.println("已占总内存大小"+Runtime.getRuntime().totalMemory()/1024/1024);//252MB

        //6.JVM剩余内存大小-byte
        System.out.println("剩余内存大小"+Runtime.getRuntime().freeMemory()/1024/1024);//248MB

        //7.运行cmd命令
        //shutdown:关机
        //-s:默认1min后关机
        //-s -t:指定时间：指定关机时间
        //-a:取消关机操作
        //-r:关机并重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
