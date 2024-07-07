package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //定义JFrame对象
        JFrame jFrame = new JFrame();
        //设置界面宽高
        jFrame.setSize(603,680);
        //设置界面标题
        jFrame.setTitle("事件演示");
        //设置界面置顶，始终最上层
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置，取消后按照XY坐标
        jFrame.setLayout(null);

        //1.创建按钮对象
        JButton jbt = new JButton("提交");
        //2.设置按钮位置和宽高
        jbt.setBounds(0,0,100,50);
        //3.1给按钮添加动作监听
        //jbt：组件对象
        //addActionListener：给哪个对象添加动作监听？
        //()内参数：表示事件被触发后执行的代码,执行了接口的实现类，参数为实现类对象
        //jbt.addActionListener(new MyActionListener());
        //【注意】实际开发中，每个按钮的业务逻辑不同，
        //MyActionListener类只会被用到一次，只能给jbt按钮使用
        //所以没必要单独写一个类出来，可以用——匿名内部类完成
        //3.2
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("匿名内部类的点击事件");
            }
        });


        //4.按钮添加到界面中
        jFrame.getContentPane().add(jbt);


        //是否显示
        jFrame.setVisible(true);
    }
}
