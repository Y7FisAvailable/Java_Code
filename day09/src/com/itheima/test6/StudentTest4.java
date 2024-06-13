package com.itheima.test6;

public class StudentTest4 {
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

        //要求5；查找id为2的学生，年龄+1
        //id来自元素，元素由索引定位，其实就是查索引
        int index = getIndex(arr,2);
        if(index >= 0){
            //说明索引存在
            int newAge = arr[index].getAge() + 1;//取出age并+1放入newAge中
            arr[index].setAge(newAge);//将newAge放入setAge中完成年龄更新
        }else {
            //索引不存在
            System.out.println("id不存在，无法修改");
        }

        //遍历数组
        countArr(arr);
    }

    //遍历数组
    public static void countArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){//元素的非空判断
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }
        }
    }

    //id匹配
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if(stu != null){//判断元素是否为空？
                int sid = arr[i].getId();
                if(sid == id){
                    return i;
                }
            }
        }
        return -1;
    }
}
