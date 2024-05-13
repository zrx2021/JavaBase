package xuan.demo1面向对象入门.demo1random;

import java.util.Random;
import java.util.Scanner;

/*
目标：随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中结束游戏
    1.先随机生成一个1-100之间的数据
    2.定义一个死循环让用户可以一直猜测
    3.在死循环里，每次都提示用户输入一个猜测的数字，猜大提示过大，猜小提示过小，猜中则结束游戏
 */
public class Test2 {
    public static void main(String[] args) {
        // 1.先随机生成一个1-100之间的数据 [1,100] -> -1 -> [0,99] + 1
        Random r = new Random();
        // 随机数
        int luckNumber = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        // 2.定义一个死循环让用户可以一致猜测
        while (true) {
            System.out.println("请输入要猜测的数字");
            // 猜测的数字
            int guessNumber = sc.nextInt();

            if (guessNumber > luckNumber) {
                // 猜大提示过大
                System.out.println(guessNumber + "过大");
            } else if (guessNumber < luckNumber) {
                // 猜小提示过小
                System.out.println(guessNumber + "过小");
            } else {
                // 猜中结束游戏
                System.out.println("恭喜你猜中了");
                break;// 结束循环， 程序结束
            }
        }
    }
}
