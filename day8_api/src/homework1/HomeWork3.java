package homework1;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String code = generateCode(n);
        System.out.println("得到的验证码是：" + code);

        n = sc.nextInt();
        code = generateCode(n);
        System.out.println("得到的验证码是：" + code);
    }

    public static String generateCode(int n) {
        System.out.println("调用方法，传入整数：" + n);
        Random r = new Random();
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] chars = str.toCharArray();
        String code = "";
        char[] newChars = new char[n];

        for (int i = 0; i < n; i++) {
            newChars[i] = chars[r.nextInt(chars.length)];
        }

        return new String(newChars);
    }
}
