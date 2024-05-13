package com.itheima.test03;

import java.util.Scanner;

/*
需求
    实现敏感词的屏蔽。
     玩游戏时。我们会发现，如果|输入的是一些骂人或者不文明的词，都会被屏蔽掉，变成**。现在要求：如果用户输入的词语中包含"尼玛"，"你妈"，"草","操","傻逼"这些词语，都统一屏蔽为"**"。

程序执行，在控制台输出效果【效果不唯一】
    例如输入的内容是："我草尼玛，你个傻逼上单，只会带线，永远不跟团";
    屏蔽之后的结果是： "我****，你个**上单，只会带线，永远不跟团"
 */
public class Test03 {
    public static void main(String[] args) {
        // 1.使用数组保存敏感词库
        String[] sensitiveWords = new String[] {"尼玛", "你妈", "草","操","傻逼"};

        // 2.用户输入内容
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消息: ");
        String msg = sc.next();

        // 3.遍历敏感词库,获取每个敏感词,替换敏感词
        for (int i = 0; i < sensitiveWords.length; i++) {
            String word = sensitiveWords[i];
            msg.replace(word, "**");
        }

        System.out.println(msg);
    }
}
