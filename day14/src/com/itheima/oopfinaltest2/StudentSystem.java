package com.itheima.oopfinaltest2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {

    //private：要求本类中才能是使用
    //static：因为下面startStudentSystem()方法是静态方法，静态只能访问静态
    //final：要求变量为常量，赋值一次后不能被修改
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String CHANGE_STUDENT = "3";
    private static final String SEARCH_STUDENT = "4";
    private static final String EXIT = "5";


    public static void startStudentSystem() {
        //定义集合，用来存放学生对象
        ArrayList<Student> list = new ArrayList<>();

        loop: while(true){//进行操作后继续返回到菜单页面，true循环
            System.out.println("--------------------欢迎来到黑马学生管理系统--------------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.print("请输入您的选择：");
            //键盘录入选择
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();//用next而不是nextInt是因为next能接收字符型，接收进来再判断，容错率更高

            switch(choose){
                case ADD_STUDENT -> {
                    System.out.println("正在执行,添加学生...");
                    addStudentInfo(list);
                }
                case DELETE_STUDENT -> {
                    System.out.println("正在执行,删除学生...");
                    deleteStudentInfo(list);
                }
                case CHANGE_STUDENT -> {
                    System.out.println("正在执行,修改学生...");
                    changeStudentInfo(list);
                }
                case SEARCH_STUDENT -> {
                    System.out.println("正在执行,查询学生...");
                    searchStudentInfo(list);
                }
                case EXIT -> {
                    System.out.println("已退出退出系统!");
                    break loop;
                }
                default -> {
                    System.out.println("无此选项，重新输入!!!");
                    System.out.println();
                }
            }
        }

    }
    //添加,手动录入,集合,需要返回值：是否成功添加？
    public static void addStudentInfo(ArrayList<Student> list){
        //空参构造，创建学生对象
        Student stu = new Student();

        //键盘录入
        Scanner sc = new Scanner(System.in);
        String id = null;

        while(true){
            System.out.print("请输入id：");//id需要校验,第一次添加id如何对比呢？此时集合为空
            id = sc.next();
            //调用方法，判断id是否唯一
            boolean flag = uniquenessId(list,id);
            if(flag){
                //表示id存在，需要重新输入id
                System.out.println("当前id存在，请重新输入");
            }else{
                //表示id不存在，可以添加
                stu.setId(id);//键盘录入存入对象对应属性
                //这里添加id后如果不break跳出while循环，则永远不会执行到输入name行
                break;
            }
        }

        System.out.print("请输入name：");
        String name = sc.next();
        stu.setName(name);

        System.out.print("请输入age：");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.print("请输入address：");
        String address = sc.next();
        stu.setAddress(address);

        //对象封装完成，存入集合
        list.add(stu);
        //提示添加成功，ArrayList特点是无论什么都会添加成功
        System.out.println("学生信息添加成功！");

    }
    //删除,需要集合，判断id存在，存在：提示成功，不存在：提示删除失败，并返回初始菜单
    public static void deleteStudentInfo(ArrayList<Student> list){
        //键盘录入id
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的id:");
        String id = sc.next();

        //判断id，调用getIndex方法获取索引
        int index = getIndex(list,id);
        //判断索引是否存在，-1为不存在
        if(index >= 0){
            //表示索引存在,直接删除
            list.remove(index);
            System.out.println("id为" + id + "的学生信息已被删除！");
        }else{
            System.out.println("id为" + id + "的学生信息不存在，删除失败！");
        }
    }
    //修改
    public static void changeStudentInfo(ArrayList<Student> list){
        //键盘录入id
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的id：");
        String id = sc.next();

        //调用getIndex判断id是否存在
        int index = getIndex(list,id);
        if(index >= 0){
            //表示存在,键盘录入其他信息，
            System.out.println("id为"+ id + "的学生信息存在，请修改！");
            System.out.print("请输入name：");
            String name = sc.next();
            list.get(index).setName(name);

            System.out.print("请输入age：");
            int age = sc.nextInt();
            list.get(index).setAge(age);

            System.out.print("请输入address：");
            String address = sc.next();
            list.get(index).setAddress(address);

            //提示添加成功，ArrayList特点是无论什么都会添加成功
            System.out.println("学生信息修改成功！");
        }else {
            //表示不存在
            System.out.println("id为" + id + "的学生信息不存在，无法修改！");
            //return;//当返回值类型为void时，可以写return;或者直接省略，return后的语句是不执行的！
        }
    }
    //查询,当集合长度为0——无学生信息，长度大于0，遍历集合输出
    public static void searchStudentInfo(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后查询！");
            System.out.println();
            //为什么这里加return？————集合无学生，当然停止方法
            return;
        }

        //该方法执行到了这行，表示集合中有学生信息
        //首先，打印表头
        System.out.println("id\t姓名\t年龄\t地址");//注意制表符 \t 的使用
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId()+ "\t" + stu.getName()+ "\t" + stu.getAge()+ "\t" + stu.getAddress());//注意制表符 \t 的使用
        }
    }
    //id唯一性
    public static boolean uniquenessId(ArrayList<Student> list,String id){
        //循环遍历集合得到每个对象的id
        for (int i = 0; i < list.size(); i++) {
            String sid = list.get(i).getId();
            //id存在，返回true
            if(sid.equals(id)){//注意==和.equals的区别，==用于判断数字，如果判断了字符串，则判断的是的地址值！自然不相等
                return true;
            }
        }
        //全部遍历后，id不存在，返回false
        return false;
    }
    //查找id，存在返回索引，不存在返回-1
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            String sid = list.get(i).getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
