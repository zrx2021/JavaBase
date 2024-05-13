package xuan.demo1面向对象入门.demo5动态初始化数组;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的分数：");
            scores[i] = sc.nextDouble();
            // sum = (double) (sum + score[i])
            sum += scores[i];
        }

        System.out.println("总分是：" + sum + "。平均分是：" + sum / scores.length);
    }
}
