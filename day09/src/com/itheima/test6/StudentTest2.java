package com.itheima.test6;

public class StudentTest2 {
    public static void main(String[] args) {
        //定义数组
        Student[] arr = new Student[3];
        //创建对象
        Student stu1 = new Student(1,"A",10);
        Student stu2 = new Student(2,"B",11);
        Student stu3 = new Student(3,"C",12);
        //填充数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //创建stu4对象
        Student stu4 = new Student(4,"D",13);
        //判断id是否唯一？
        boolean flag = contains(arr,stu4.getId());
        if(flag){
            //id重复
            System.out.println("id重复，重新输入！");
        }else{
            //id没重复，判断数组是否已满？
            int count = arrLength(arr);
            if(count == arr.length){
                //数组已满，创建新数组，长度为老数组+1，复制老数组元素，添加stu4
                Student[] newArr = newArr(arr);
                newArr[count] = stu4;
                //遍历数组
                getArr(newArr);
            }else{
                //数组未满，直接添加
                arr[count] = stu4;
                //遍历数组
                getArr(arr);
            }
        }
    }
    //定义方法，遍历数组
    public static void getArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
        }
    }

    //定义方法，创建新数组
    public static Student[] newArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //定义方法，判断数组是否已满？
    public static int arrLength(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //定义方法，判断id唯一性,需要：数组、id
    public static boolean contains(Student[] arr, int id){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            //如果元素不为null，进入判断id
            if(arr[i] != null){
                if(arr[i].getId() == id){
                    flag = true;
                }
            }
        }
        return flag;
    }
}
