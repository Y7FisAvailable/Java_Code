package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {

    public MyJFrame3() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶，始终最上层
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置，取消后按照XY坐标
        this.setLayout(null);

        //给整个窗体增加监听
        //调用者this：本类对象，界面JFrame对象，表示给整个界面添加监听
        //addKeyListener：添加键盘监听的方法
        //参数this：当事件触发，执行本类中的对应代码
        this.addKeyListener(this);

        //是否显示
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //细节1：
    //如果按下一个按键不松后，会重复调用keyPressed方法
    //细节2：
    //键盘按键很多，如何区分？
    //每个按键都有一个编号与之对应
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按住不松开");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int keyCode = e.getKeyCode();
        if (keyCode == 65) {
            System.out.println("输入的是A");
        } else if (keyCode == 66) {
            System.out.println("输入的是B");
        }
    }
}
