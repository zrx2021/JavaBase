package xuan.demo1面向对象入门.demo8return特殊用法;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        divide(10, 0);
        System.out.println("结束");
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            return;
        }
        System.out.println(a / b);
    }
}
