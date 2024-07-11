package a06objectdemo1;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@776ec8df

        Student stu = new Student();//static调用static
        String str2 = stu.toString();
        System.out.println(str2);//a06objectdemo1.ObjectDemo1$Student@3b07d329


        //细节：
        //System：类名
        //out：静态变量
        //System.out：获取打印对象
        //println();方法调用
        //参数：表示打印的内容
        //核心逻辑：
        //打印对象时，底层调用对象的toString方法，变成字符串
        //打印在控制台，然后换行

        //想要看到对象内部的属性值？
        //方法：方法重写toString
        System.out.println(stu);//a06objectdemo1.ObjectDemo1$Student@3b07d329

        //toString结论:
        //打印对象，想看到对象里的属性值，只需要重写toString方法即可
        //在方法重写中，把对象的属性值进行拼接

    }
}
