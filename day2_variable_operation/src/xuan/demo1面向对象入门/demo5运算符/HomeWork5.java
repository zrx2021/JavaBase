package xuan.demo1面向对象入门.demo5运算符;

public class HomeWork5 {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println(year + "年是否为闰年：" + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
    }
}
