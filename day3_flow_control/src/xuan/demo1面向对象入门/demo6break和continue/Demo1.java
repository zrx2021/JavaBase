package xuan.demo1面向对象入门.demo6break和continue;

public class Demo1 {
    public static void main(String[] args) {
        // 1.打印1到10的数字，如果出现3，就结束循环
        // 2.打印1到10的数字，如果出现3，就跳过这一次循环
        for (int i = 1; i < 11; i++) {
            if (i == 3) {
                // break; // 结束整个循环
                continue; // 结束这一次循环，接着下一次循环
            }
            System.out.println(i);
        }
    }
}
