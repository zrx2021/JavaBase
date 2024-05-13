package xuan.demo1面向对象入门.demo2switch;

public class Demo1 {
    public static void main(String[] args) {
        /*
目标：掌握switch的格式和执行流程
    需求：做个电子备忘录，在控制台分别输出一周的工作安排
        星期一：埋头苦干，解决bug
        星期二：请求大牛程序员帮忙
        星期三：今晚啤酒、小龙虾、烧烤
        星期四：主动帮助新来的女程序解决bug
        星期五：今晚吃鸡
        星期六：与王婆介绍的小芳相亲
        星期日：郁郁寡欢、准备上班
 */
        int week = 1;
        switch (week) {
            case 1:
                System.out.println("星期一：埋头苦干，解决bug");
                break;
            case 2:
                System.out.println("星期二：请求大牛程序员帮忙");
                break;
            case 3:
                System.out.println("星期三：今晚啤酒、小龙虾、烧烤");
                break;
            case 4:
                System.out.println("星期四：主动帮助新来的女程序解决bug");
                break;
            case 5:
                System.out.println("星期五：今晚吃鸡");
                break;
            case 6:
                System.out.println("星期六：与王婆介绍的小芳相亲");
                break;
            case 7:
                System.out.println("星期日：郁郁寡欢、准备上班");
                break;
            default:
                System.out.println("没有这样的星期");
        }
    }
}
