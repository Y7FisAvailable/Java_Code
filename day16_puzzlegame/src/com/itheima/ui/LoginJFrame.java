package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {

    //LoginJFrame窗体的构造方法，用来初始化宽高、是否隐藏等属性
    //在创建登录界面的时候，同时给界面设置一些信息
    public LoginJFrame(){
        //这里不需要创建对象，对象的地址值来自this
        //JFrame loginJFrame = new JFrame();

        this.setSize(488,430);

        //设置界面的标题
        this.setTitle("拼图 登录");

        //设置界面置顶，始终在最上面
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置关闭模式
        //EXIT_ON_CLOSE = 3，一个关闭 = 全部关闭 = 停止
        //DISPOSE_ON_CLOSE = 2 每个都关 = 停止
        //HIDE_ON_CLOSE = 1 关闭只是隐藏界面，JVM没有停止
        //DO_NOTHING_ON_CLOSE = 0 无法关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置窗体是否展示（建议写在最后）
        this.setVisible(true);
    }
}
