package homework1;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            boolean isCorrect = isCorrectID(sc.next());
            System.out.println("结果：" + isCorrect);
        }
    }

    public static boolean isCorrectID(String id) {
        int length = id.length();
        if (length != 18) {
            return false;
        }

        if (id.charAt(0) <= '0' || id.charAt(0) > '9') {
            return false;
        }

        if (id.charAt(17) < '0' || id.charAt(17) > '9') {
            if (id.charAt(17) != 'X') {
                return false;
            }
        }

        char[] chars = id.toCharArray();
        for (int i = 1; i < 17; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
