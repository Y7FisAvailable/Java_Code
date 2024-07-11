package a06objectdemo1;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan",23);
        Student stu2 = new Student("zhangsan",23);

        if (stu1.equals(stu2)) {
            System.out.println("相等");
        }else {
            System.out.println("不等");
        }

        //情况1:
        //equals比较的是两个对象，因为两个对象是new出来的，赋值是地址值
        //地址值不相同，打印结果为"不等"

        //情况2:
        //要对比对象内属性是否相同？
        //在Student类中，方法重写equals
        //ctrl + alt + insert 选择 “equals() and hashCode()”
        //方法重写后，对比的就是对象内部的属性，打印结果为"相等"

        //结论：
        //1.如果没有重写equals方法，那么默认使用object中的方法进行比较，比较的是地址值是否相等
        //2.一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值了。|
    }
}
