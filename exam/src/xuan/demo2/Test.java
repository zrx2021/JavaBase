package xuan.demo2;

import java.util.ArrayList;

/*
“李莉”，”数学”，80
“刘刚”，”语文”，75
“何天”，”英语”，95
“赵勇”，”语文”，85
“孙红”，”语文”，55
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("李莉", "数学", 80);
        Student s2 = new Student("刘刚", "语文", 75);
        Student s3 = new Student("何天", "英语", 95);
        Student s4 = new Student("赵勇", "语文", 85);
        Student s5 = new Student("孙红", "语文", 55);

        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        ArrayList<Student> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getCourse().equals("语文") && s.getScore() > 60) {
                newList.add(s);
            }
        }

        int sum = 0;

        for (int i = 0; i < newList.size(); i++) {
            Student s = newList.get(i);
            sum += s.getScore();
        }

        double average = sum * 1.0 / newList.size();
        System.out.println("平均值是：" + average);

        for (int i = 0; i < newList.size(); i++) {
            Student s = newList.get(i);
            if (s.getScore() > average) {
                System.out.println("大于平均值的对象，姓名：" + s.getName() + " 课程：" + s.getCourse() + " 分数：" + s.getScore());
            }
        }
    }
}
