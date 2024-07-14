package a10regexDemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*
            正则表达式练习:
            需求
                请编写正则表达式验证用户名是否满足要求。
                要求:大小写字母，数字，下划线一共4-16位
            请编写正则表达式验证身份证号码是否满足要求。
                简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
                复杂要求:按照身份证号码的格式严格要求。

            身份证号码:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024 I
            430102197606046442
        */

        //1.请编写正则表达式验证用户名是否满足要求。
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));//true
        System.out.println("lisi".matches(regex1));//true
        System.out.println("wwangwu".matches(regex1));//true
        System.out.println("$123".matches(regex1));//false



        System.out.println("---------------------------------------------------");
        //2.请编写正则表达式验证身份证号码是否满足要求。
        //简单要求:18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        String regex2 = "[1-9][0-9]{16}(\\d|X|x)";//()小括号表示一个整体，可读性强，里面加竖线|
        String regex22 = "[1-9]\\d{16}[\\dXx]";//[]方括号表示 “任意出现一个” 即可，里面不加竖线|
        System.out.println("610104199807145717".matches(regex2));//true
        System.out.println("010104199807145717".matches(regex2));//false
        System.out.println("61010419980714571x".matches(regex2));//true



        System.out.println("---------------------------------------------------");
        String regexTest = "[0-9[Xx]]";
        System.out.println("0".matches(regexTest));//true
        System.out.println("X".matches(regexTest));//true
        System.out.println("x".matches(regexTest));//true



        System.out.println("---------------------------------------------------");
        //忽略大小写的书写方式
        //在正则匹配的时候忽略abc大小写
        //   (?i)：该符号后的字符忽略大小写
        String regex3 = "(?i)abcdef";
        System.out.println("ABCDEF".matches(regex3));//true



        System.out.println("---------------------------------------------------");
        //3.请编写正则表达式验证身份证号码是否满足要求。
        //复杂要求:按照身份证号码的格式严格要求。

        //410801 1993 02 28 457x
        //前面6位:省份，市区，派出所等信息，第一位不能是0，后面5位是任意数字
        //      [1-9]\\d{5}
        //年的前半段: 18 19 20
        //年的后半段: 任意数字出现两次
        //      (18|19|20)\\d{2}
        //月份: 01~ 09 10 11 12
        //      (0[1-9]|1[0-2])
        //日期: 01~09 10~19 20~29 30 31
        //      (0[1-9]|[12]\\d|3[01])
        //后面四位: 任意数字出现3次 最后一位可以是数字也可以是大写x或者小写x
        //      \\d{3}[\\d(?i)x]

        //问题：不够严谨，2月可能出现30、31号
        String regex4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\d(?i)x]";
    }
}
