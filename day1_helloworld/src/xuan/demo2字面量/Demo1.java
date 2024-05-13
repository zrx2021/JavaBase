package xuan.demo2字面量;

/*
目标：字面量的使用
(包名是为了方便所以用中文，只能为小写字母)
 */
public class Demo1 {
    public static void main(String[] args) {
        //整数
        System.out.println(1);
        System.out.println(2);

        //小数
        System.out.println(3.14);
        System.out.println(-5.21);

        //字符：''包裹，有且仅有一个文字
        System.out.println('a');
        System.out.println('8');
        System.out.println('我');
        System.out.println(' ');

//        非法
//        System.out.println('');
//        System.out.println('10');

//        字符串：”“包裹，里面内容任意
        System.out.println("黑马程序员");
        System.out.println("Hello World");
        System.out.println("");

        //布尔类型
        System.out.println(true);
        System.out.println(false);

//        空值：null引用数据类型的默认值，表示什么都没有，null不能打印
//        System.out.println(null);
    }
}
