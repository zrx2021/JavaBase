package com.itheima.test05;

import java.util.ArrayList;

/*
需求
一、  请按以下要求编写代码：
    1.  定义Student类，包含以下属性：
        学号、姓名、身高
    2.  定义MainApp类，包含main()方法
    3.  在main()方法中，创建一个可以存储Student对象的集合对象
    4.  创建以下几个Student对象：
        学号      姓名      身高
        it001   黄渤      1.72
        it002   孙红雷 1.78
        it003   章子怡 1.64
        it004   杨颖      1.68
    5.  将上面几个对象添加到集合中
    6.  遍历集合打印每个对象的属性值
    7.  获取并打印集合大小
    8.  获取第3个学员对象，并打印其属性值
    9.  移除掉第4个学员对象
    10. 再次获取并打印集合大小
    11. 将第一个对象替换为以下对象
        it005   撒贝宁 1.67
    12. 遍历集合，打印出身高在1.70以上的学员信息
    13. 遍历集合，打印出“孙”姓的学员信息
 */
public class Test05 {
    public static void main(String[] args) {
        // 3.在main()方法中，创建一个可以存储Student对象的集合对象
        ArrayList<Student> list = new ArrayList<>();
        // 4.定义学生对象
        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);
        // 5.将上面几个对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 6.遍历集合打印每个对象的属性值
        System.out.println("学号\t\t姓名\t\t\t身高");
        for (int i = 0; i < list.size(); i++) {
            // 索引 i = 0, 1, 2, 3
            Student s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t\t\t" + s.getHeight());
        }

        // 7.获取并打印集合大小
        System.out.println("集合元素个数为:" + list.size());

        // 8.获取第3个学员对象，并打印其属性值
        Student stu3 = list.get(2);
        System.out.println("第三个学生信息为:");
        System.out.println("学号 : " + stu3.getId() + " , 姓名 : " + stu3.getName() + " , 身高 : " + stu3.getHeight());

        // 9.移除掉第4个学员对象
        list.remove(3);

        // 10.再次获取并打印集合大小
        System.out.println("集合元素个数为:" + list.size());

        // 11.将第一个对象替换为以下对象
        // it005	撒贝宁	1.67
        Student s5 = new Student("it005", "撒贝宁", 1.67);
        list.set(0, s5);

        // 12.遍历集合，打印出身高在1 .70 以上的学员信息
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getHeight() > 1.70) {
                System.out.println(s.getName() + " , " + s.getHeight());
            }
        }

        // 13.遍历集合，打印出“孙”姓的学员信息
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getName().startsWith("孙")) {
                System.out.println(s.getName());
            }
        }
    }
}
