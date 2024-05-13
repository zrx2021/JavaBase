package com.itheima.test04;

/*
需求
    现在有一个字符串，包含了一些书籍名字，请把书籍的名字切割出来。切割完之后，把包含Java的书籍输出来。
    包含书籍名称的字符串内容是： "《Head First Java》、《Effective Java》、《Python核心编程》、《Java并发实践》、《Thinking in Java》、《Python编程快速上手》"

程序执行，在控制台输出效果
    《Head First Java》
    《Effective Java》
    《Java并发实践》
    《Thinking in Java》
 */
public class Test04 {
    public static void main(String[] args) {
        // 1.先使用一个字符串，存储所有书籍的名称
        String content = "《Head First Java》、《Effective Java》、《Python核心编程》、《Java并发实践》、《Thinking in Java》、《Python编程快速上手》";

        // 2.使用字符串中的split()方法，按照"、"把里面的书籍信息分割出来。存放到一个字符串数组中
        String[] ss = content.split("、"); // new String[] {"《Head First Java》", "Effective Java》", "《Python核心编程》", "《Java并发实践》", "《Thinking in Java》", "《Python编程快速上手》"}

        // 3.遍历字符串数组，获取里面的每一个字符串
        for (int i = 0; i < ss.length; i++) {
            // 索引 i = 0, 1, 2, 3, 4, 5
            // 3.1.使用字符串的contains，结合if语句，判断字符串内容中是否包含"Java"，如果是，则输出这个字符串
            if (ss[i].contains("Java")) {
                System.out.println(ss[i]);
            }
        }
    }
}
