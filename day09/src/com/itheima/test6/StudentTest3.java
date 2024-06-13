package com.itheima.test6;

public class StudentTest3 {
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

        //要求3：通过id删除学生，存在则删除，不存在则提示删除失败
        //1.先判断id和数组中id，id来自元素，元素由索引查找，有删除，无删失败
        int index = getIndex(arr,2);
        if(index >= 0){
            arr[index] = null;//index号索引掷空
            //要求4：遍历数组
            countArr(arr);
        }else {
            System.out.println("该id不存在，删除失败");
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

    //判断id实际是找数组中学生对象对应的索引
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];//取出索引内学生元素
            if(stu != null){//判断元素为空？为空则无法调用null.getId
                int sid = stu.getId();//取出元素的id
                if(sid == id){
                    return i;//id存在，返回id对用索引i
                }
            }
        }
        return -1;//如果遍历数组都没有对应id，返回不是索引的数据-1
    }
}
