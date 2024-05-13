package xuan.demo1面向对象入门.demo1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        int[] userNumbers = userChoseNumbers();
        int[] luckyNumbers = generateLuckyNumbers();
        compareNumbers(userNumbers, luckyNumbers);
    }

    public static int compareNumbers(int[] userNumbers, int[] luckyNumbers) {
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (userNumbers[i] == luckyNumbers[j]) {
                    countRed++;
                    break;
                }
            }
        }
        countBlue = userNumbers[6] == luckyNumbers[6] ? 1 : 0;
        if (countRed == 6 && countBlue == 1) {
            System.out.println("恭喜你中1000万");
            return 6;
        }else if (countRed == 6 && countBlue == 0) {
            System.out.println("恭喜你中500万");
            return 5;
        }else if (countRed == 5 && countBlue == 1) {
            System.out.println("恭喜你中3000元");
            return 4;
        }else if (countRed == 5 && countBlue == 0 || countRed == 4 && countBlue == 1) {
            System.out.println("恭喜你中200元");
            return 3;
        }else if (countRed == 4 && countBlue == 0 || countRed == 3 && countBlue == 1) {
            System.out.println("恭喜你中10元");
            return 2;
        }else if (countRed >= 0 && countRed <= 2 && countBlue == 1) {
            System.out.println("恭喜你中5元");
            return 1;
        } else {
            System.out.println("感谢您的参与");
            return 0;
        }
    }

    public static int[] generateLuckyNumbers() {
        Random r = new Random();
        int[] arr = new int[7];
        for (int i = 0; i < 6; i++) {
            int number = r.nextInt(33) + 1;
            if (exist(arr, number)) {
                i--;
            } else {
                arr[i] = number;
            }
        }
        arr[6] = r.nextInt(16) + 1;
        System.out.println("幸运号码是：" + Arrays.toString(arr));
        return arr;
    }

    private static int[] userChoseNumbers() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码：");
            int choseNumber = sc.nextInt();
            if (choseNumber < 1 || choseNumber > 33) {
                System.out.println("对不起，您输入的号码不在范围之内，请重新输入");
                i--;
                continue;
            }
            if (exist(numbers, choseNumber)) {
                System.out.println("对不起，您输入的重复请重新输入");
                i--;
            } else {
                numbers[i] = choseNumber;
            }
        }
        System.out.println("请输入蓝球号码：");
        while (true) {
            int blue = sc.nextInt();
            if (blue >= 1 && blue <= 16) {
                numbers[6] = blue;
                break;
            }
            System.out.println("对不起，您输入的号码不在范围之内，请重新输入：");
        }
        System.out.println("您所选的号码是：" + Arrays.toString(numbers));
        return numbers;
    }

    private static boolean exist(int[] numbers, int choseNumber) {
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == choseNumber) {
                return true;
            }
        }
        return false;
    }
}
