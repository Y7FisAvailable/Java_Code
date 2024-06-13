package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //定义集合，用来放入用户对象！
        ArrayList<User> list = new ArrayList<>();

        //键盘录入
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----欢迎使用学生管理系统-----");
            System.out.println("1-登录  2-注册  3-忘记密码  4-退出");
            System.out.print("选择您的操作：");
            String choose = sc.next();

            switch (choose){
                case "1" -> {
                    login(list);
                }
                case "2" -> {
                    signUp(list);
                }
                case "3" -> {
                    forgotPWD(list);
                }
                case "4" -> {
                    System.out.println("欢迎您的使用，再见！");
                    System.exit(0);
                }
                default -> {
                    System.out.println("没有这个选项，请重新输入！");
                }
            }
        }
    }

    //【忘记密码方法】
    private static void forgotPWD(ArrayList<User> list) {
        //1.录入用户名，不存在——提示未注册，结束方法，存在——继续输入身份证、手机号
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入用户名：");
        String username = sc.next();
        boolean flag = loginUsername(list,username);
        if(!flag){
            //不一致
            System.out.println("该用户名不存在，用户未注册！");
            return;//后面代码不执行了
        }

        //执行到这里，说明用户名存在
        //2.比对身份证、手机号，一致——提示修改密码，不一致——提示信息不匹配
        System.out.print("请输入身份证号码：");
        String idNumber = sc.next();
        System.out.print("请输入手机号码：");
        String phoneNumber = sc.next();

        //3.验证list里的username、idNumber、phoneNumber

        //获取用户名为username的用户对象的索引
        int index = findIndex(list,username);
        User user = list.get(index);
        if(!(user.getIdNumber().equalsIgnoreCase(idNumber) && user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("账号信息不匹配，修改失败。");
            return;
        }

        //信息一致
        String password;
        while (true) {
            System.out.print("请输入新密码：");
            password = sc.next();
            System.out.print("请再次输入新密码：");
            String againPassword = sc.next();

            if(password.equals(againPassword)){
                System.out.println("两次密码一致！");
                break;
            }else{
                System.out.println("两次密码不一致，请重新输入！");
                continue;
            }
        }

        user.setPassword(password);
        System.out.println("密码修改成功！");
    }

    private static int findIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            String rightUsername = list.get(i).getUsername();
            if(username.equals(rightUsername)){
                return i;
            }
        }
        return -1;
    }

    //【注册方法】，先注册后才能登录，才能忘记密码，逻辑顺序
    private static void signUp(ArrayList<User> list) {
        //注册本质，数据填入对象中，对象存入集合中
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);

        String username;
        while (true) {
            System.out.print("请输入用户名：");
            username = sc.next();

            boolean flag1 = checkUsername(username);
            if(!flag1){
                //返回true说明username合法，合法不提示，不合法才需要提示
                System.out.println("您输入的用户名不合法，请重新输入！");
                //执行if语句，表示用户名不合法，需要再次输入，使用continue跳出本次循环，不再执行下面代码
                continue;
            }

            //用户名唯一
            boolean flag2 = uniquenessUsername(list,username);
            if(flag2){
                //返回true为相等
                System.out.println("您输入的用户名：" + username + "已存在，请重新输入！");
            }else {
                //不相等，可以录入
                System.out.println("用户名：" + username + "可用");
                //可用后，不再继续循环，准备输入其他数据，所以break跳出整个循环
                break;
            }
        }

        //2.两次输入密码，并对比
        String password;
        while (true) {
            System.out.print("请输入密码：");
            password = sc.next();
            System.out.print("请再次输入密码：");
            String againPassword = sc.next();
            if(!password.equals(againPassword)){
                //不相等
                System.out.println("两次密码输入不一致，请重试！");
                continue;//执行if不执行else，此时上一行代码为本次循环最后一行，continue其实可以不加！仅为可读性
            }else {
                System.out.println("两次密码输入一致，请继续录入其他数据！");
                break;
            }
        }

        //3.键盘录入身份证号
        String idNumber;
        while (true) {
            System.out.print("请输入身份证号码：");
            idNumber = sc.next();
            boolean flag3 = checkIdNumber(idNumber);
            if(flag3){
                System.out.println("您输入的身份证号码合法，请继续录入其他数据！");
                break;//执行if，说明身份证号合法，继续下一步，所以跳出while
            }else {
                System.out.println("您的身份证号码不合法，请重试！");
                continue;
            }
        }

        //4.键盘录入手机号
        String phoneNumber;
        while (true) {
            System.out.print("请输入手机号码：");
            phoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(phoneNumber);
            if(flag4){
                System.out.println("手机号码格式正确");
                break;
            }else {
                System.out.println("您的手机号码不合法，请重试！");
                continue;
            }
        }

        //5.属性存入对象，对象存入集合
        User user = new User(username,password,idNumber,phoneNumber);
        list.add(user);
        System.out.println("注册成功！");

        //6.遍历集合，验证注册是否成功
        printList(list);
    }

    private static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + "," + user.getPassword() + "," + user.getIdNumber() + "," + user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        //长度11
        int len = phoneNumber.length();
        if(len != 11){
            return false;
        }

        //不能0开头
        boolean result = phoneNumber.startsWith("0");
        if(result){
            return false;
        }

        //都是数字，遍历字符串，取出每个字符，判断范围
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIdNumber(String idNumber) {
        //长度18
        int len = idNumber.length();
        if(len != 18){
            return false;
        }

        //不能0开头，用到字符串的成员方法——startWith，返回值为boolean类型
        boolean result = idNumber.startsWith("0");
        if(result){
            //result为true，则是以0开头，所以返回false
            return false;
        }
        //前17是数字，即，遍历字符串，0~最大索引-1范围是'0'-'9'
        for (int i = 0; i < idNumber.length() - 1; i++) {//length是长度，最大长度18，最大索引17
            char c = idNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        //最后一位是数字、X、x
        char endChar = idNumber.charAt(17);//这里注意：17是写死了，可以改为 idNumber.length() - 1;
        if(!((endChar >= '0' && endChar <= '9')||(endChar == 'X')||(endChar == 'x'))){
            return false;
        }
        //如果上面校验都通过则返回true
        //其实也可以在判断数字、X、x的时候加上else表示如果合法返回true，则在下面不用单独return true
        return true;
    }

    private static boolean uniquenessUsername(ArrayList<User> list,String username) {
        //取出集合中用户对象的username，与键盘录入的username对比
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if(rightUsername.equals(username)){
                //相等
                return true;
            }
        }
        //不相等
        return false;
    }

    private static boolean checkUsername(String username) {
        //判断：用户名长度必须在3~15位之间
        //即username<3或username>15不合法
        int len = username.length();
        if(!(len >= 3 && len <= 15)){
            return false;
        }

        //代码执行到这里，说明长度合法
        //判断：只能是字母加数字的组合
        //即字符串的每个字符的范围都在a-z A-Z 0-9中间
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9'))){
                //不在这个范围内，直接返回false
                return false;
            }
        }

        //代码执行到这里，说明长度合法、范围合法
        //但是不能是纯数字，即至少有一个字符为字母，定义计数器判断字母>0，即可。（注意：不能纯数字，没说不能纯字母）
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
                count++;
                break;//username中只需要有一个字母即为合法，所以count++一次后，循环便可以停止
            }
        }
        //遍历后，通过count的情况返回true或者false
        return count > 0;
    }

    //生成验证码
    private static String getCode(){
        //定义集合，存入a-z A-Z，因为集合长度可变，用起来方便
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {//字母个数为26

            list.add((char)('a' + i));//i为索引，开始是0；'a' + i = 97,强转结果为'a'
            list.add((char)('A' + i));//大写字母
        }

        //抽4个字符，获取随机索引,生成长度为4的字母字符串
        StringBuilder sb = new StringBuilder();//创建空白sb对象
        Random r = new Random();//创建随机数

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());////范围是0-51索引
            char c = list.get(index);
            sb.append(c);
        }

        //随机数字添加末尾
        int number = r.nextInt(10);
        sb.append(number);

        //sb转字符串转字符数组，交换索引，实现数字在任意位置
        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        //字符数组转字符串
        String result = new String(arr);//redundant 冗

        return result;
    }

    //【登录方法】
    private static void login(ArrayList<User> list) {
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {//3次机会！

            System.out.print("请输入用户名：");
            String username = sc.next();
            boolean flag = loginUsername(list,username);
            if(!flag){
                //未注册，不需要你再次输入用户名
                //跳转回系统主页面从登录、注册、忘记中选择，这里不用while循环包裹！
                System.out.println("用户名"  + username + "未注册，请先注册！");
                return;//return表示，结束后面的代码不再执行
            }

            //2.键盘录入密码
            System.out.print("请继续输入密码：");
            String password = sc.next();

            //先输入密码，然后录入验证码确保真人操作（本地单机完成），然后在执行数据库查询对比操作（联网完成）
            //所以逻辑顺序没错！

            //3.键盘录入验证码
            //先给出正确验证码
            while (true) {
                String rightCode = getCode();
                System.out.println("正确的验证码为["+ rightCode +"]");
                System.out.print("请输入验证码：");
                String code = sc.next();
                //验证码忽略大小写
                if(!code.equalsIgnoreCase(rightCode)){
                    //验证码错误
                    System.out.println("您的验证码有误，请重新输入！");
                    continue;
                }else {
                    System.out.println("验证码正确！");
                    break;
                }
            }

            //4.定义方法，验证用户名和密码是否对应，是否有误
            boolean flag2 = checkUserInfo(list,username,password);
            if(flag2){
                System.out.println("登录成功！您可以开始使用学生管理系统了！");
                //创建对象调用方法，启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            }else{
                System.out.println("用户名或密码错误，请重新输入！");
                if(i == 2){
                    //最后一次也失败
                    System.out.println("您的用户：" + username + "已被锁定！");
                    return;
                }else {
                    System.out.println("您还有" + (2 - i) + "次机会！");
                }
            }
        }
    }

    private static boolean checkUserInfo(ArrayList<User> list,String username,String password) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if((user.getUsername().equals(username))&&(user.getPassword().equals(password))){
                return true;
            }
        }
        return false;
    }

    private static boolean loginUsername(ArrayList<User> list,String username) {
        //集合取出用户的username，进行对比，一致——请输入密码，不一致——请注册
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if(username.equals(rightUsername)){
                //一致——跳转下一步：输入密码
                return true;
            }
        }
        //都不一致，提示请先注册
        return false;
    }
}
