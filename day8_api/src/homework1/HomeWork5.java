package homework1;

import java.util.Scanner;

/*
转账时，关键信息屏蔽和验证。
    需求：模拟转账功能。转账时，要求输入对方的姓氏，输入正确之后，才能转账。
    现在有人准备想秦艾德转账，要求，先把秦艾德的姓氏屏蔽，再让对方输入姓氏。
    如果输入正确，打印：姓氏输入正确，可以转账。如果输入不正确，打印：姓氏输入不正确，不能转账
 */
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "秦爱德";

        String tail = name.substring(1);

        System.out.println("把名字屏蔽之后的效果：*" + tail);
        System.out.println("请输入对方姓氏：");
        if (sc.next().equals(name.substring(0, 1))) {
            System.out.println("结果：姓氏输入正确，可以转账");
        } else {
            System.out.println("结果：姓氏输入错误，不能转账");
        }
    }
}
