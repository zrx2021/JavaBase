package xuan.demo5构造器;

public class Student {
    String name;
    double score;

    public Student() {
        System.out.println("无参构造器");
    }

    public Student(String name, double score) {
        System.out.println("满参构造器");
        // 把方法的参数赋值给成员变量
        this.name = name;
        this.score = score;
    }

    public void show() {
        System.out.println("姓名为：" + name);
        System.out.println("成绩为" + score);
    }
}
