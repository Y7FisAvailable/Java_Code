package com.itheima.test6;

public class StudentTest {
    public static void main(String[] args) {
        //1.定义数组
        Student[] arr = new Student[3];

        //2.创建学生对象1-3个,并添加数组
        Student stu1 = new Student(1,"张三",18);
        Student stu2 = new Student(2,"李四",19);
        Student stu3 = new Student(3,"王五",20);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //3.添加一个学生对象,新建学生对象
        Student stu4 = new Student(4,"陈六",20);

        //4.判断id和数组中的id是否重复
        boolean flag = contains(arr,stu4.getId());
        if(flag){
            //4.1重复——提示id重复，重新添加
            System.out.println("id重复，请重新输入！");
        }else {
            //4.2不重复——判断当前数组长度是否已满？
            int count = arrLength(arr);
            if(count == arr.length){
                //1满了——创建新数组，拷贝老数组，添加新元素
                Student[] newArr = newArr(arr);
                newArr[count] = stu4;
                countArr(newArr);
            }else {
                //2没满——直接添加,count是指数组现有元素个数，也指数组中下一个null元素的索引！
                arr[count] = stu4;
                countArr(arr);
            }
        }
    }

    //遍历数组方法
    public static void countArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){//元素的非空判断
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    //创建新数组，长度为老数组+1,需要把新数组返回
    public static Student[] newArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //判断当前数组是否已满？定义方法
    public static int arrLength(Student[] arr){
        //定义计数器，当数组元素为默认值null时，我们认为该元素为空
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){
                count++;
            }
        }
        return count;
    }

    //id唯一性判断
    public static boolean contains(Student[] arr,int id){
        boolean flag = false;//id不存在
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != null){//如果数组元素不为null，判断id，如果为null则没有id，无法判断
                    if(arr[i].getId() == id){
                        flag = true;//id存在
                }
            }
        }
        return flag;
    }
}
