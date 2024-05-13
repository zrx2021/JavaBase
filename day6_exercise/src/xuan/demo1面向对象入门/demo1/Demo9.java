package xuan.demo1面向对象入门.demo1;

import java.util.Arrays;

/*
有一个字符数组存储的内容如下: 'a', 'b', 'c', 'X', 'Y', 'Z', 定义方法字符数组的内容大写变成小写,小写变成大写, 把数组反转, 输出转换后的内容
 */
public class Demo9 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'X', 'Y', 'Z'};
        processArray(chars);
    }

    public static void processArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] -= 32;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }

        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        System.out.println(Arrays.toString(chars));
    }
}
