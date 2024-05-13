package xuan.demo1面向对象入门.homework;

public class HomeWork3 {
    public static void main(String[] args) {
        getRangeSum(10, 20);
    }

    public static void getRangeSum(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
