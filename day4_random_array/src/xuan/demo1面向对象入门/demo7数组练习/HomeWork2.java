package xuan.demo1面向对象入门.demo7数组练习;

public class HomeWork2 {
    public static void main(String[] args) {
        double[] numbers = {-12.9, -53.54, -75.0, -99.1, -3.14};
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("最小值是：" + min);
    }
}
