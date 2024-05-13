package xuan.demo1面向对象入门.demo2进制演示;

public class Demo01 {
    public static void main(String[] args) {
//        二进制以：0b/0B开头
        System.out.println(0b1101001);// 程序自动把二进制转成十进制：105
        System.out.println(0B1101001);

//        八进制以0开头
        System.out.println(01234567);// 程序把八进制转成十进制：342391

//        十六进制以：0x/0X开头
        System.out.println(0x1f2d);
        System.out.println(0X1f2d);
    }

}
