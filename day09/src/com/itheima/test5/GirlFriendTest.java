package com.itheima.test5;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建对象
        GirlFriend gf1 = new GirlFriend("小A",10,'女',"吃饭");
        GirlFriend gf2 = new GirlFriend("小B",10,'男',"喝水");
        GirlFriend gf3 = new GirlFriend("小C",10,'女',"玩耍");
        GirlFriend gf4 = new GirlFriend("小D",14,'男',"娱乐");

        //3.对象存入数组
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.计算平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriends = arr[i];
            sum += girlFriends.getAge();
        }
        int avg = sum / arr.length;

        //5.如果年龄小于avg，打印对象
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend girlFriend = arr[i];//数组中取出每个对象元素
            int age = girlFriend.getAge();//这步多余，可以直接有girlFriend.getAge();
            if(girlFriend.getAge() < avg){
                count++;
                System.out.println(girlFriend.getName() + " " + girlFriend.getAge() + " " + girlFriend.getSex() + " " + girlFriend.getHobby());
            }
        }
        System.out.println("共有：" + count + "个");
    }
}
