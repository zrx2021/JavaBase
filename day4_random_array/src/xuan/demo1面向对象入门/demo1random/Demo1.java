package xuan.demo1面向对象入门.demo1random;

import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        // 1.创建随机数对象
        Random r = new Random();

        // 2.生成随机数，生成0到9的随机数，不包含指定数字
        int i = r.nextInt(10);
        System.out.println("i = " + i);

        // 需求2：生成 65 到 91 之间的随机数
        // [65 到 91] -> -65 -> [0 到 26] + 65
        int y = r.nextInt(27) + 65;
        System.out.println("y = " + y);
    }
}
