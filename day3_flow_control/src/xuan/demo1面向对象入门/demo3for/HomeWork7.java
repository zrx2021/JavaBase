package xuan.demo1面向对象入门.demo3for;

public class HomeWork7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i >= j) {
                    System.out.print(j + "x" + i + "=" + i * j + "\t");
                }
                if (j > 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
