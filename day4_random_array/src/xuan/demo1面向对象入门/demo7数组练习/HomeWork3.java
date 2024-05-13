package xuan.demo1面向对象入门.demo7数组练习;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] score = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum * 1.0 / score.length);
    }
}
