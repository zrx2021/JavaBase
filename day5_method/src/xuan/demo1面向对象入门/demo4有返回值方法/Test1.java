package xuan.demo1面向对象入门.demo4有返回值方法;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(getMax(10, 20));
    }

    public static int getMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }
}
