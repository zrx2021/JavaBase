package xuan.demo1面向对象入门.homework;

public class HomeWork4 {
    public static void main(String[] args) {
        getMin(10, 20, 30);
    }

    public static void getMin(int a, int b, int c) {
        int temp = a < b ? a : b;
        temp = temp < c ? temp : c;
        System.out.println(temp);
    }
}
