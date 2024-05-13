package xuan.demo1面向对象入门.demo1方法介绍;

public class Demo1 {
    public static void main(String[] args) {
        getAverage();

        System.out.println("----------------------");
        getAverage();

        getAverage();
    }

    public static void getAverage() {
        int a = 10;
        int b = 20;
        int c = 30;

        int sum = a + b + c;
        int avg = sum / 3;
        System.out.println("平均值" + avg);
    }
}
