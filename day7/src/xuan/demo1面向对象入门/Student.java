package xuan.demo1面向对象入门;

public class Student {
    String name;
    double chineseScore;
    double mathScore;

    public void printTotalScore() {
        System.out.println("姓名为：" + name + "，语文成绩为" + chineseScore + "，数学成绩为" + mathScore);
    }

    public void printAverageScore() {
        System.out.println("姓名为：" + name + (chineseScore + mathScore) / 2);
    }
}
