package com.itheima.ui;

import javax.swing.*;
import java.util.Random;

//GameJFrame 继承 JFrame
//setSize、setVisible都是继承了父类的方法
public class GameJFrame extends JFrame {
    //创建一个二维数组
    //目的:管理图片数据
    //加载图片的时候，会根据二维数组中的数据进行顺序加载
    //成员位置
    int[][] data = new int[4][4];

    //构造方法就是在创建对象的时候，用来初始化的！
    public GameJFrame() {

        //初始化界面
        initJFrame();

        //初始化菜单栏
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //初始化图片，加载图片（根据打乱后的结果去加载）
        initImage();

        //设置窗体是否展示（建议写在最后）
        this.setVisible(true);
    }

    //初始化数据（打乱）
    private void initData() {
        //1.创建一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //2.获取随机索引
        Random r = new Random();

        //3.打乱
        for (int i = 0; i < tempArr.length; i++) {
            int randomIndex = r.nextInt(16);//0-15
            //以下代码可能会让某个元素重复出现
            //tempArr[i] = tempArr[randomIndex];

            int temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }

        //5.给二维数组添加数据
        //方法一：遍历一维数组
        for (int i = 0; i < tempArr.length; i++) {
            //i = 0
            //0 / 4 = 0，0 % 4 = 0 -> data[0][0]
            //i = 1
            //1 / 4 = 0，1 % 4 = 1 -> data[0][1]
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片，加载图片
    //添加图片，按照二维数组中管理的数据添加
    private void initImage() {

        //外循环 --- 初始化四行
        for (int i = 0; i < 4; i++) {
            //内循环 --- 初始化一行的4张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要添加的图片的序号
                int num = data[i][j];

                //创建一个图片ImageIcon对象
                ImageIcon icon = new ImageIcon("C:\\Users\\YQIF\\IdeaProjects\\Java_Code\\" +
                        "day16_puzzlegame\\image\\animal\\animal3\\" + num + ".jpg");
                //创建一个JLable对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                //get获取隐藏容器，把JLable容器添加到隐藏容器getContentPane中
                //注意：隐藏容器Pane在JFrame对象创建时，默认自动创建，只需要get调用
                this.getContentPane().add(jLabel);

                //代码至此，表示一张图片被初始化，此时准备下次循环，初始化下一张图片

                //注意：最大图片是15，但是循环嵌套会加载16.jpg，此时会创建第16个JLable对象找不到所管理的图片，会显示空白。
            }
        }
    }

    private void initJMenuBar() {
        //创建整个菜单的对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上两个选项的对象（功能 联系我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutUsJMenu = new JMenu("联系我们");

        //创建每个选项下的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //条目放入选项
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutUsJMenu.add(accountItem);

        //选项放入菜单
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutUsJMenu);

        //菜单放入JFrame界面,整个界面设置菜单,this是调用者地址值
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //用set方法设置对象的宽高，单位px，this表示调用者地址
        this.setSize(603, 680);

        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");

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

        //在初始化界面的时候就
        //取消隐藏容器Pane默认的居中放置，只有取消了才会按XY坐标的形式添加组件
        this.setLayout(null);
    }
}
