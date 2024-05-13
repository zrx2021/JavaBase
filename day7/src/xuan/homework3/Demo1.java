package xuan.homework3;

public class Demo1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("杨老师");
        teacher.setNumber("t001");
        teacher.teach();

        Teacher teacher1 = new Teacher("李老师", "t002");
        teacher1.teach();
    }
}
