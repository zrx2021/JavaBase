package com.itheima.test01;

/*
需求
    1.定义一个方法， 接收一个字符串代表QQ号码。方法中实现判断QQ是否正确：a.长度在5-12之间。 b.首位不能为0  c.其他为都是0-9的数字
    2.定义main方法，使用Scanner录入一个字符串作为QQ号码。调用方法，接收返回的结果

程序执行，在控制台输出效果
    调用方法，传入的QQ账号是： 326666777
    结果：true
    调用方法，传入的QQ账号是： 026666777
    结果：false
    调用方法，传入的QQ账号是： 3266
    结果：false
    调用方法，传入的QQ账号是： 3266123456789
    结果：false
 */
public class Test01 {
    public static void main(String[] args) {
        // 3.定义main方法，键盘录入一个字符串，调用方法， 传入字符串，接收返回的结果。
        System.out.println(checkQQ("326666777"));
        System.out.println(checkQQ("026666777"));
        System.out.println(checkQQ("3266"));
        System.out.println(checkQQ("3266123456789"));
    }

    // 1.自定义一个方法，方法接收一个字符串，返回值为布尔类型。如果传入的QQ账号是正确的，就返回true，如果是不正确的就返回false。
    public static boolean checkQQ(String QQNumber) {
        // 2.1 判断字符串的长度是否在[5,12]之间
        if (QQNumber.length() < 5 || QQNumber.length() > 12) {
            return false;
        }

        // 2.2 先判断字符串是否以0开始。可以使用startsWith()的方法判断。
        if (QQNumber.startsWith("0")) {
            return false;
        }

        // 2.3 遍历字符串,其他为都是0-9的数字
        for (int i = 0; i < QQNumber.length(); i++) {

            // 索引 i = 0, 1, 2, 3 ...
            char c = QQNumber.charAt(i); // '2'
            if (c < '0' || c > '9') {
                return false;
            }
        }

        // 2.6 循环结束之后，返回true。代表所有都是数字字符
        return true;
    }
}
