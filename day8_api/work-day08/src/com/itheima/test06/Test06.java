package com.itheima.test06;

import java.util.ArrayList;

/*
需求
    1.定义ArrayList集合，存入多个字符串
        如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
    2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
    3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 */
public class Test06 {
    public static void main(String[] args) {
        // 1.定义ArrayList集合，存入多个字符串
        ArrayList<String> list = new ArrayList<>(); // "ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"

        list.add("ab1");
        list.add("123ad");
        list.add("bca");
        list.add("dadfadf");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦");
        list.add("别跑啊");

        // 2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
        for (int i = 0; i < list.size(); i++) {
            // 索引i = 0, 1, 2, 3, 4,  5, 6, 7
            String str = list.get(i);
            if (str.length() > 5) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list); // [ab1, 123ad, bca, 你好啊, 我来啦, 别跑啊]

        // 3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
        for (int i = 0; i < list.size(); i++) {
            // 索引i = 0, 1, 2, 3, 4,  5
            String str = list.get(i); // 123ad
            // 遍历字符串,看是否包含0-9的数字
            for (int j = 0; j < str.length(); j++) {
                // 字符串的索引j = 0, 1, 2 ...
                char c = str.charAt(j);
                if (c >= '0' && c <= '9') {
                    list.remove(i);
                    i--;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
