package xuan.demo1面向对象入门.demo2静态初始化数组;

/*
 * 使用静态初始化数组方式：保存自己小组同学的名字
 * 使用String类型
 * */
public class Test1 {
    public static void main(String[] args) {
        String[] group = new String[]{"周荣轩", "龙杰", "杨成林", "赵永生"};
        String[] group2 = {"周荣轩", "龙杰", "杨成林", "赵永生"};
        System.out.println(group);
        System.out.println(group2);
    }
}
