package xuan.demo1面向对象入门.demo7数组练习;

public class HomeWork9 {
    public static void main(String[] args) {
        int[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均成绩：" + sum * 1.0 / arr.length);
    }
}
