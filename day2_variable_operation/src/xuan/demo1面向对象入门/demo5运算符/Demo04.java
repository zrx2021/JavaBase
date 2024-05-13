package xuan.demo1面向对象入门.demo5运算符;

public class Demo04 {
    public static void main(String[] args) {
        // >: 大于
        System.out.println(5 > 10); // false
        System.out.println(5 > 2);// true

        // >=: 大于等于
        System.out.println(5 >= 10);// false
        System.out.println(5 >= 5);// true
        System.out.println(5 >= 2);// true

        // <: 小于
        System.out.println(5 < 10);// true
        System.out.println(5 < 2);// false

        // ==: 在Java比较相等必须会使用 == 号
        System.out.println(5 == 5);// true
        System.out.println(5 == 2);// false

        //注意：判断相等一定要写==号
        int a = 5;
        int b = 2;
        System.out.println(a == b);// false
        System.out.println(a = b); // 2

        // !=
        System.out.println(5 != 10); // true
        System.out.println(5 != 5); // false
    }
}
