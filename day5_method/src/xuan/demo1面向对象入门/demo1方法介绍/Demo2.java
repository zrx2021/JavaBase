package xuan.demo1面向对象入门.demo1方法介绍;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("开始");

        getSum();
    }

    public static void getSum() {
        int a = 10;
        int b = 20;

        int sum = a + b;
        System.out.println("总和 = " + sum);
    }
}
