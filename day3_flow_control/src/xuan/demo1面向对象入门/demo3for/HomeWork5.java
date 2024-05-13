package xuan.demo1面向对象入门.demo3for;

public class HomeWork5 {
    public static void main(String[] args) {
        for (int i = 1949; i <= 2023; i++) {
            if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
                System.out.println(i);
            }
        }
    }
}
