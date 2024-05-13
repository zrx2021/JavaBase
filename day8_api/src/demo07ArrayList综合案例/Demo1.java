package demo07ArrayList综合案例;

import java.util.ArrayList;

/*
1.定义Student类，包含以下属性：学号、姓名、身高
2.在main()方法中，创建一个可以存储Student对象的集合对象；
    学号(id)		姓名(name)		身高(height)
    it001	    黄渤		        1.72
    it002	    孙红雷	        1.78
    it003	    章子怡	        1.64
    it004	    杨颖		        1.68
    it005	    那英		        1.70
3.将上面几个对象添加到集合中
4.遍历集合打印【每个对象】的属性值
5.获取第3个学员对象，并打印其属性值
6.查询id为it003的学生信息
7.遍历集合，打印出姓“孙”且身高大于1.70的学生
 */
public class Demo1 {
    public static void main(String[] args) {
        // 2.创建一个可以存储Student对象的集合对象
        ArrayList<Student> list = new ArrayList<>();

        // 3.创建Student对象保存Student信息
        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);
        Student s5 = new Student("it005", "那英", 1.70);

        // 4.将上面几个对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("list = " + list);

        System.out.println("--------------------------------------");

        // 5.遍历集合打印 每个对象 的属性值
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("id：" + s.getId() + " name：" + s.getName() + " height：" + s.getHeight());
        }

        System.out.println("--------------------------------------");

        // 6. 获取第3个学员对象，并打印其属性
        Student stu = list.get(2);
        System.out.println("id：" + stu.getId() + " name：" + stu.getName() + " height：" + stu.getHeight());

        System.out.println("--------------------------------------");

        // 7. 查询id为it003的学生信息，不知道id为it003的学生是哪一个，遍历判断
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals("it003")) {
                System.out.println("id：" + s.getId() + " name：" + s.getName() + " height：" + s.getHeight());
                break;
            }
        }

        System.out.println("--------------------------------------");

        // 8.遍历集合，打印出姓“孙”且身高大于1.70的学生
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getName().startsWith("孙") && s.getHeight() > 1.70) {
                System.out.println("id：" + s.getId() + " name：" + s.getName() + " height：" + s.getHeight());
                break;
            }
        }
    }
}
