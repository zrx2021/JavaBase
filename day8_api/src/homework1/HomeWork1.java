package homework1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrect;
        for (int i = 0; i < 4; i++) {
            String next = sc.next();
            isCorrect = isCorrectQQNumber(next);
            System.out.println("结果：" + isCorrect);
        }
    }

    public static boolean isCorrectQQNumber(String number) {
        System.out.println("调用方法，传入的QQ账号是：" + number);
        int length = number.length();
        if (length < 5 || length > 12) {
            return false;
        }

        if (number.charAt(0) == '0') {
            return false;
        }

        char[] chars = number.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
