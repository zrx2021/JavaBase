package homework1;

import java.util.Scanner;

/*
实现敏感词的屏蔽。
    玩游戏时。我们会发现，如果输入的是一些骂人或者不文明的词，都会被屏蔽掉，变成**。
    现在要求：如果用户输入的词语中包含"尼玛"，"你妈"，"草","操","傻逼"这些词语，都统一屏蔽为"**"。
 */
public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replace("尼玛", "**");
        str = str.replace("你妈", "**");
        str = str.replace("草", "**");
        str = str.replace("操", "**");
        str = str.replace("傻逼", "**");
        System.out.println(str);
    }
}
