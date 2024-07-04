package com.itheima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //1.创建主界面三个窗体对象
        //JFrame相当于一个JavaBean类，有属性（宽高）、行为

        //主界面
        //包含：上下左右移动代码逻辑
        //统计步数逻辑、查看结果、一键通关、恶搞等逻辑
        JFrame gameJFrame = new JFrame();
        //2.用set方法设置对象的宽高
        gameJFrame.setSize(603, 680);//px
        //3.设置窗体是否展示,
        gameJFrame.setVisible(true);

        //登录界面
        //包含：获取用户名、密码逻辑、验证码、对比等逻辑
        JFrame loginJFrame = new JFrame();
        loginJFrame.setSize(488,430);
        loginJFrame.setVisible(true);

        //注册界面
        JFrame registerJFrame = new JFrame();
        registerJFrame.setSize(488,500);
        registerJFrame.setVisible(true);

    }
}
