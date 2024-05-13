package demo03String常用方法;

import java.util.Scanner;

/*
        "12345"     "1236aab789"    "123"   "0123"
        定义方法：判断字符串是否是一个QQ号码, QQ号码的要求: 1.长度是5到12位数字    2.第一位不能是0
            是否需要参数： 要QQ号码，就是一个字符串
            是否需要返回值：  是否是QQ号 ==> boolean
            功能逻辑:
                1.如果长度不是5到12位返回false
                2.如果第一位是'0'返回false
                3.得到字符串中的每个字符,看是否是数字字符  '0', '1', ... '9'       字符 >= '0' && 字符 <= '9'
                4.如果包含非数字字符返回false
                5.如果全是数字字符返回返回true
     */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号");
        String qq = sc.next();
        if (isQQNumber(qq)) {
            System.out.println("是QQ号码");
        } else {
            System.out.println("不是QQ号码");
        }
    }

    public static boolean isQQNumber(String qq) {
        int length = qq.length();
        if (length < 5 || length > 12) {
            return false;
        }
        if (qq.charAt(0) == '0') {
            return false;
        }
        char[] chars = qq.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
