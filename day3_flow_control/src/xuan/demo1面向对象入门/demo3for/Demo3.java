package xuan.demo1面向对象入门.demo3for;

public class Demo3 {
    public static void main(String[] args) {
        // 求水仙花数
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            // 个位
            int a = i % 10;
            // 十位
            int b = i / 10 % 10;
            // 百位
            int c = i / 100;
            // 个位、十位、百位的立方之和等于本身
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i + "是水仙花数");
                count++;
            }
        }
        System.out.println("有" + count + "个水仙花数");
    }
}
