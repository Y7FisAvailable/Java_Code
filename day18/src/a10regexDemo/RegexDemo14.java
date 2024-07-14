package a10regexDemo;

public class RegexDemo14 {
    public static void main(String[] args) {
        /*

        非捕获分组:分组之后不需要再用本组数据，仅仅是把数据括起来。

        身份证号码:
        41080119930228457x
        510801197609022309
        15040119810705387X
        130133197204039024
        430102197606046442

                */
        //身份证号码的简易正则表达式
        //非捕获分组:仅仅是把数据括起来
        //特点:非捕获分组，不占用组号
        //19行代码，这里\\1报错原因:(?:)就是非捕获分组，此时是不占用组号的，代码不知道谁是第一组。

        //(?:) (?=) (?!)都是非捕获分组
        //更多的使用第一个
        //String regex1 ="[1-9]\\d{16}(?:\\d|x|x)\\1";
        String regex2 ="[1-9]\\d{16}(\\d Xx)";
        String regex3 ="[1-9]\\d{16}(?:\\d Xx)";
        //regex2和regex3结果一样，?:可加可不加
        System.out.println("41080119930228457x".matches(regex2));
        System.out.println("41080119930228457x".matches(regex3));
    }
}
