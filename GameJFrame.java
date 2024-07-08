package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//GameJFrame 继承 JFrame
//setSize、setVisible都是继承了父类的方法
public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //创建一个二维数组
    //目的:管理图片数据
    //加载图片的时候，会根据二维数组中的数据进行顺序加载
    //成员位置
    int[][] data = new int[4][4];

    //创建win数组，用来判断是否胜利
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0},
    };

    //定义计数器step
    int step = 0;

    //空白块再二维数组中的位置，一个相对位置，相对于自己的位置
    int x = 0;
    int y = 0;

    //定义一个变量path，记录当前图片的路径
    String path = "day16_puzzlegame\\image\\animal\\animal3\\";

    //创建每个选项下的条目对象
    JMenuItem changeImg = new JMenuItem("更换图片");
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

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
            if (tempArr[i] == 0) {
                //元素为0，记录位置
                x = i / 4;
                y = i % 4;
            }
                //数据是0也添加
                data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片，加载图片（背景图片也是图片）
    //添加图片，按照二维数组中管理的数据添加
    private void initImage() {
        //清空原本已出现的所有图片
        this.getContentPane().removeAll();

        //data[][] == win[][],展示胜利图标
        if (victory()) {
            //显示胜利图标
            ImageIcon winIcon = new ImageIcon("day16_puzzlegame/image/win.png");
            JLabel winJLabel = new JLabel(winIcon);
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        //计数器
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //外循环 --- 初始化四行
        for (int i = 0; i < 4; i++) {
            //内循环 --- 初始化一行的4张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要添加的图片的序号
                int num = data[i][j];

                //创建一个图片ImageIcon对象
                ImageIcon icon = new ImageIcon(path + num + ".jpg");
                //创建一个JLable对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j + 84, 105 * i + 134, 105, 105);
                //添加图片边框
                //0凸1凹
                //jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                jLabel.setBorder(new BevelBorder(1));
                //get获取隐藏容器，把JLable容器添加到隐藏容器getContentPane中
                //注意：隐藏容器Pane在JFrame对象创建时，默认自动创建，只需要get调用
                this.getContentPane().add(jLabel);

                //代码至此，表示一张图片被初始化，此时准备下次循环，初始化下一张图片
                //注意：最大图片是15，但是循环嵌套会加载16.jpg，此时会创建第16个JLable对象找不到所管理的图片，会显示空白。
            }
        }
        //添加背景图片
        //1.创建图片ImageIcon对象,给出图片路径
        //ImageIcon background = new ImageIcon("C:\\Users\\YQIF\\IdeaProjects\\Java_Code\\day16_puzzlegame\\image\\background.png");
        //2.创建JLable对象，管理容器
        JLabel background = new JLabel(new ImageIcon("day16_puzzlegame\\image\\background.png"));
        //3.设置宽高和位置
        background.setBounds(40, 40, 508, 560);
        //4.图片放入界面
        this.getContentPane().add(background);

        //刷新界面,不刷新还是最初的图片顺序
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建整个菜单的对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上两个选项的对象（功能 联系我们）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutUsJMenu = new JMenu("关于我们");


        //条目绑定动作监听事件
        changeImg.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //条目放入选项
        functionJMenu.add(changeImg);
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

        //给界面添加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //键盘某个键按住不松，会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        //判断游戏是否胜利？胜利——此方法结束
        if (victory()) {
            return;
        }

        int keyCode = e.getKeyCode();
        if (keyCode == 65) {//65=a,大小写通用
            //1.删除当前界面中的全部图片
            this.getContentPane().removeAll();
            //2.加载一张完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            //3.设置位置和宽高
            all.setBounds(83, 134, 420, 420);
            //4.完整图片放入界面中
            this.getContentPane().add(all);
            //5.加载背景图片
            JLabel background = new JLabel(new ImageIcon("day16_puzzlegame\\image\\background.png"));
            //6.设置宽高和位置
            background.setBounds(40, 40, 508, 560);
            //7.图片放入界面
            this.getContentPane().add(background);
            //8.刷新界面,不刷新还是最初的图片顺序
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利？胜利——此方法结束
        if (victory()) {
            return;
        }

        //对上下左右判断
        //左37 上38 右39 下40
        int keyCode = e.getKeyCode();
        if (keyCode == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                //x=0，此时空白块在最上面，上面再没有图片可以向下了
                //直接return，不再执行if下的代码
                return;
            }
            //向左移动：数字块向左移动，白块向右移动
            //白块在二维数组的索引[xy]，数字块[x,y+1]
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            //步数step++
            step++;
            initImage();
        } else if (keyCode == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            //逻辑：
            //空白块在二维数组中被标记为0元素，其坐标xy不一定都是00
            //空白块下的数字元素向上移动一格
            //xy为空白块坐标
            //x+1,y为空白块下方数字坐标
            //(x,y)——>(x+1,y)

            //移动二要素：1.存储的值的移动  2.白块位置对于初始坐标的移动
            //把空白块下方数字元素赋值给空白块，注意是元素赋值，与坐标无关
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;//相当于挪上去后，原位置元素被0元素替代
            //白块坐标往下一格，x++;白块向上一格，x--
            x++;
            //步数step++
            step++;
            //在坐标和内容都移动后
            //调用方法，按照最新的数字加载对应图片
            initImage();

        } else if (keyCode == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            //向右移动：数字块向右移动，白块向左移动
            //白块在二维数组的索引[xy]，数字块[x,y-1]
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            //步数step++
            step++;
            initImage();
        } else if (keyCode == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                //x=0，此时空白块在最上面，上面再没有图片可以向下了
                //直接return，不再执行if下的代码
                return;
            }
            //向下移动：数字块向下移动，白块向上移动一格
            //白块位置[xy]，数字块位置[x-1,y]
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;//数字块原位置被0元素覆盖
            x--;
            //步数step++
            step++;
            //移动后，初始化方法，重新按照数字加载对应图片
            initImage();
        } else if (keyCode == 65) {
            //松开a,初始化图片
            //此时清空完整图片，按照二维数组的数据加载未完成的游戏图片顺序，加载背景图
            initImage();
        } else if (keyCode == 87) {//作弊码W
            //1.按顺序加载1-15图
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0},
            };
            //2.重新加载 按照数组顺序
            initImage();
        }
    }

    //判断当前数组和win数组，方法
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            //data.length二维数组长度
            //data[i]二维数组元素，即一维数组长度
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    //一个不等于，返回false
                    return false;
                }
            }
        }
        //遍历结束都等于
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayItem) {
            System.out.println("重新游戏");
            //1.计数器清零
            step = 0;
            //2.打乱二维数组
            initData();
            //3.重新加载
            initImage();

        } else if (source == reLoginItem) {
            System.out.println("重新登录");
            //1.关闭当前游戏界面
            this.setVisible(false);
            //2.打开游戏界面
            new LoginJFrame();
        } else if (source == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        } else if (source == accountItem) {
            System.out.println("公众号");
            //1.创建弹窗JDialog
            JDialog jDialog = new JDialog();
            //2.ImageIcon和JLabel
            ImageIcon imageIcon = new ImageIcon("day16_puzzlegame/image/about.png");
            JLabel jLabel = new JLabel(imageIcon);
            //3.设置jLabel位置和宽高
            jLabel.setBounds(0,0,258,258);
            //4.图片添加到弹窗
            jDialog.getContentPane().add(jLabel);
            //5.设置弹窗大小
            jDialog.setSize(344,344);
            //6.弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //7.弹窗居中,否则在屏幕左上角
            jDialog.setLocationRelativeTo(null);
            //8.弹窗不关闭则无法操作下面界面
            jDialog.setModal(true);
            //9.弹窗显示出来
            jDialog.setVisible(true);
        }
    }
}
