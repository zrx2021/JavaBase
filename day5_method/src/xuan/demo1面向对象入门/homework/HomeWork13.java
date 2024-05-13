package xuan.demo1面向对象入门.homework;

public class HomeWork13 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 4.5;
        System.out.println(round(a));
        System.out.println(round(b));
    }

    public static int round(double n) {
        int number = (int) n;
        double m = n - number;
        m *= 10;
        if (m >= 5) {
            return ++number;
        } else {
            return number;
        }
    }
}
