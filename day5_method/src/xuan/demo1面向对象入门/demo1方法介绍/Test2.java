package xuan.demo1面向对象入门.demo1方法介绍;


public class Test2 {
    public static void main(String[] args) {
        System.out.println(getMax(1, 2));
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
