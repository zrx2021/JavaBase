package xuan.demo3变量;

public class Demo1 {
    public static void main(String[] args) {
        //变量的格式：数据类型 变量名 = 数据;
//        定义变量保存年龄
        int age = 23;
        System.out.println(age);

//        变量的特点：数据可以变化 格式：变量名 = 新的值;
        age = 36;
        System.out.println(age);

//        变量的好处，方便程序操作数据

        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);
        System.out.println(age);

        //定义变量保存微信余额 小数 9.5 double
        double money = 9.5;
        System.out.println(money);

        //早餐花了4元
        money = money - 4;
        System.out.println(money);

//        定义变量表示微信的名称 字符串
        String name = "吉山第一靓仔";
        System.out.println(name);
    }
}
