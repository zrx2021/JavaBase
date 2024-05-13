package xuan.demo1面向对象入门.demo3for;

public class HomeWork3 {
    public static void main(String[] args) {
        for (int i = 1949; i <= 2023; i++) {
            if ((2023 - i) % 12 == 0) {
                System.out.println(i);
            }
        }
    }
}
