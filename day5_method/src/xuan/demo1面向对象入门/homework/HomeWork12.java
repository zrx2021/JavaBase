package xuan.demo1面向对象入门.homework;

public class HomeWork12 {
    public static void main(String[] args) {
        double number = -3.14;
        double abs = abs(number);
        System.out.println(number +"的绝对值是" + abs);
    }

    public static double abs(double number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }
}
