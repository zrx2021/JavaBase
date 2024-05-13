package xuan.demo4this关键字;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 = " + s1);
        s1.name = "迪丽热巴";
        s1.score = 700;

        s1.printThis();
        s1.checkPass(620);

        System.out.println("-------------------------");

        Student s2 = new Student();

        System.out.println("s2 = " + s2);
        s2.printThis();
    }
}

