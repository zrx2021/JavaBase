package xuan.demo1面向对象入门.demo3数据类型;

public class Demo01 {
    public static void main(String[] args) {
        // 变量的格式：数据类型 变量名 = 数据;
        // 1.整型
        // byte: 范围 -128 到 127
        byte b1 = 127;
        System.out.println(b1);

        // short
        short s1 = 666;
        System.out.println(s1);

        // int
        int i1 = 2147483647;
        System.out.println(i1);

        // 注意：写一个整数，默认是int类型，超出int范围报错
        // long
        long l1 = 123;
        long l2 = 2147483648l;
        System.out.println(l1);
        System.out.println(l2);

//        2.浮点型
//        注意：小数默认地double,float类型后面必须加f/F
//        float
        float f1 = 3.14F;
        System.out.println(f1);

        // double, double后面可以加d/D, 一般都不加
        double d1 = 6.66;

        // 3.字符型
        char c1 = 'a';
        System.out.println(c1);

        // 4.布尔型
        // boolean
        boolean b2 = true;

    }

}
