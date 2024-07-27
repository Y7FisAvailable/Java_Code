package com.itheima.Test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {

        //'a'->97
        String s1 = "ca";
        String s2 = "cb";
        int result = s1.compareTo(s2);//里面是s1的每个字母 - s2的每个字母,c=c 比a-b
        //s1<s2返回负数
        //s1=s2返回0
        //s1>s2返回正数
        System.out.println(result);//-1


        //1.创建GirlFriend对象
        GirlFriend gf1 = new GirlFriend("xiaoshishi",3,1.60);//o2
        GirlFriend gf2 = new GirlFriend("xiaodandan",2,1.62);
        GirlFriend gf3 = new GirlFriend("xiaohuihui",1,1.77);

        //2.放入数组
        GirlFriend[] arr = {gf1,gf2,gf3};

        //3.sort排序
        //compare方法的形式参数:
        //参数一o1:表示在无序服列中，遍历得到的每一个元素
        //参数二o2:有序序列中的元素

        //返回值:
        //方法需要返回一个整数，以指示两个对象的相对顺序

        //负数:表示当前要插入的元素o1是小的，放在前面
        //正数:表示当前要插入的元素o1是大的，放在后面
        //0:表示当前要插入的元素o1跟现在的元素比是一样的,也会放在后面
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                System.out.println(temp);
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                //temp = o1 - o2已经表示顺序排序。
                if(temp > 0){
                    return 1;//o1-o2>0，o1在o2后面
                }else if(temp == 0){
                    return 0;
                }else {
                    return -1;//o1-o2<0，o1在o2前面
                }
            }
        });

        System.out.println(Arrays.toString(arr));
        //返回值类型是地址值，表示JavaBean中没有重写toString方法，PTG重写了toString
    }
}
