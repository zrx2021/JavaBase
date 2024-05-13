package xuan.demo1面向对象入门.homework;

public class HomeWork2 {
    public static void main(String[] args) {
        getMin();
    }

    public static void getMin() {
        int a = 10, b = 20, c = 30;
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
