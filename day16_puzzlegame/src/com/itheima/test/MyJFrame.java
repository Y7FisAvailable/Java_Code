package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    //1.创建按钮对象1
    JButton jbt1 = new JButton("提交");
    //创建按钮对象2
    JButton jbt2 = new JButton("确认");

    //publicMyJFrame(){...}是空参构造方法,构造方法是为了初始化
    public MyJFrame() {

        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("事件演示");
        //设置界面置顶，始终最上层
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置，取消后按照XY坐标
        this.setLayout(null);

        //2.设置按钮位置和宽高
        jbt1.setBounds(0, 0, 100, 50);
        //3.给按钮添加动作监听
        //3.3
        jbt1.addActionListener(this);//this表示本类的对象，是非静态的，本类MyJFrame
        //this调用对应方法是因为addAL是一个事件
        //其性质是，事件被触发，对应方法被调用
        //对应接口是ActionListener，对应方法是actionPerformed

        jbt2.setBounds(100, 0, 100, 25);
        jbt2.addActionListener(this);
        System.out.println(this);

        //按钮添加到界面中
        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);


        //是否显示
        this.setVisible(true);
    }

    //实现ActionListener接口后的方法重写
    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断

        //获取当前被操作的按钮是哪个？
        Object source = e.getSource();//e是按钮对象

        if (source == jbt1) {
            jbt1.setSize(200, 200);
        } else if (source == jbt2) {
            Random r = new Random();
            jbt2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
