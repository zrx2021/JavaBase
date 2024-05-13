package xuan.demo1面向对象入门.demo1;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        String code = generateVerifyCode(5);
        System.out.println("验证码：" + code);
    }

    private static String generateVerifyCode(int count) {
        String[] content = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String verifyCode = "";

        Random r = new Random();
        for (int j = 0; j < count; j++) {
            int randomIndex = r.nextInt(content.length);
            verifyCode += content[randomIndex];
        }
        return verifyCode;
    }

}
