package xuan.demo1面向对象入门.demo1;

import java.util.Scanner;

/*
在唱歌比赛中，可能有多名评委要给选手打分，分数是[0 - 100]之间的整数。
选手最后得分为：去掉最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分。
*/
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(getAverageScore(5));
    }

    public static double getAverageScore(int count) {
        int[] arr = new int[count];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            int score = sc.nextInt();
            arr[i] = score;
        }

        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int score = arr[i];
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        return 1.0 * (sum - max - min) / (count - 2);
    }
}
