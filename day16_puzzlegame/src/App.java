import com.itheima.ui.GameJFrame;

//src——App
public class App {
    public static void main(String[] args) {
        //表示程序的启动入口

        //想要开启某个窗体界面，就创建它的对象即可
        new GameJFrame();//创建对象，等同于GameJFrame gj = new GameJFrame();
                         //（）中没写，表示调用了空参构造，
                         //空参构造里的this表示该对象地址值

        //new LoginJFrame();

        //new RegisterJFrame();
    }
}
