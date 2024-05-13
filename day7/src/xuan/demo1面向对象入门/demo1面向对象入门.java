package xuan.demo1面向对象入门;

public class demo1面向对象入门 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "波妞";
        s1.chineseScore = 100;
        s1.mathScore = 100;
        s1.printTotalScore();
        s1.printAverageScore();

        System.out.println("-------------------------");

        Student s2 = new Student();
        s2.name = "波仔";
        s2.chineseScore = 59;
        s2.mathScore = 99;

        s2.printTotalScore();
        s2.printAverageScore();
    }
}
