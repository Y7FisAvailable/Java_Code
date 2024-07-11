package a06objectdemo1;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(a.equals(b));//true
        System.out.println(a.equals(sb));//false
        //a.equals(sb)
        //因为equals方法是被a调用的，而a是字符串
        //所以此时，equals方法要看String类中的
        //字符串中的equals方法，西安判断参数是否为字符串？
        //————如果是字符串，再比较内部的属性
        //————如果不是字符串，直接返回false


        System.out.println(sb.equals(a));//false
        //sb.equals(a)
        //因为equals方法是被sb调用的，而sb是StringBuilder类型
        //所以此时，equals方法看StringBuilder类中的
        //查看源码，StringBuilder中，没有重写equals方法
        //所以使用的是顶级父类Object中的equals方法
        //在Object中，默认使用==号比较两个对象地址值
        //new出的地址值一定不同，返回false
    }
}
