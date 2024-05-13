package xuan.demo1面向对象入门.demo1if;

public class IfDemo1 {
    public static void main(String[] args) {
        // 需求1：测量用户体温，发现体温高于37度就报警
        // 定义变量保存用户体温数据
        double t = 36.6;
        // 判断体温
        if (t > 37) {
            System.out.println("体温过高，拉走！");
        }

        // 需求2：现在要发出90元红包，如果钱够就发，如果钱不够则提示：余额不足
        // 定义变量表示余额
        double money = 10;

        // 发红包
        if (money > 90) {
            System.out.println("发90元红包成功！");
        } else {
            System.out.println("余额不足");
        }

        // 需求3：某个公司有一个绩效系统，根据员工的打分输出对应的绩效级别。[0,60) D [60,80) C [80,90) B [90,100] A
        // 定义变量表示绩效
        int score = 100;

        // 判断绩效等级，分支语句，一旦有个分支满足要求，执行后面的{}，后续代码不执行
        if (score >= 0 && score < 60) {
            System.out.println("D");
        } else if (score >= 60 && score < 80) {
            System.out.println("C");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else {
            System.out.println("数据不合法");
        }
    }
}
