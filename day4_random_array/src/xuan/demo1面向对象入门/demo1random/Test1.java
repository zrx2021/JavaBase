package xuan.demo1面向对象入门.demo1random;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        // 生成 50 到 90范围的随机数
        Random r = new Random();
        int i = r.nextInt(41) + 50;
        System.out.println("i = " + i);

        // 生成 1 到 10 范围的随机数
        int j = r.nextInt(10) + 1;
        System.out.println("j = " + j);
    }
}
