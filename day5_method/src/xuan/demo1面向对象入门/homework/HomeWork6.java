package xuan.demo1面向对象入门.homework;

public class HomeWork6 {
    public static void main(String[] args) {
        System.out.println(getSum(10, 20));
    }

    public static int getSum(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        return sum;
    }
}
