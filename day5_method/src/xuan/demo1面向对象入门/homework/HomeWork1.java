package xuan.demo1面向对象入门.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        getRangeSum();
    }

    public static void getRangeSum() {
        int start = 10, end = 20;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
