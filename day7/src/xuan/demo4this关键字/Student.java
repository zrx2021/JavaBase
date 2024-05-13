package xuan.demo4this关键字;

public class Student {
    String name;
    double score;

    public void printThis() {
        System.out.println("this = " + this);
    }

    public void checkPass(double score) {
        if (this.score > score) {
            System.out.println("恭喜您" + name + "考上了心目中的大学");
        } else {
            System.out.println("很遗憾没有考上");
        }
    }
}
