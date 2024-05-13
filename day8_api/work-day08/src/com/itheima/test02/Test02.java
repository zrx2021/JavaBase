package com.itheima.test02;

import java.util.Scanner;

/*
需求
    转账时，关键信息屏蔽和验证。
    需求：模拟转账功能。转账时，要求输入对方的姓氏，输入正确之后，才能转账。现在有人准备想秦艾德转账，
    要求，先把秦艾德的姓氏屏蔽，再让对方输入姓氏。如果输入正确，打印：姓氏输入正确，可以转账。如果输入不正确，打印：姓氏输入不正确，不能转账

程序执行，在控制台输出效果【效果不唯一】
    把名字屏蔽之后的效果： *艾德
    请输入对方的姓氏：张
    结果：姓氏输入错误，不能转账

    ------------------------
    把名字屏蔽之后的效果： *艾德
    请输入对方的姓氏：秦
    结果：姓氏输入正确，可以转账
 */
public class Test02 {
    public static void main(String[] args) {
        // 1. 先定义一个字符串变量name，存储指定的名字。例如，秦艾德
        String name = "秦艾德";

        // 2. 使用字符串的截取的功能substring(),截取name后面的名字。从索引为1开始，往后截取所有的内容。定义一个新的变量保存截取之后的结果
        String secondName = name.substring(1);

        // 3. 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 4. 提示对方输入姓氏。输出时， 可以使用字符串的拼接，  用"*"拼接上截取之后的内容
        System.out.println("请输入对方的姓氏:*" + secondName);
        // 5. 接收对方输入的姓氏，使用一个新的字符串变量存储
        String firstName = sc.next();

        // 6. 使用startsWith()的方法，判断name是否以对方输入的姓氏开头。给出对应的提示
        if (name.startsWith(firstName)) {
            System.out.println("姓氏输入正确，可以转账");
        } else {
            System.out.println("姓氏输入错误，不能转账");
        }
    }
}
