package homework1;

public class Demo1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setBrand("品牌1");
        computer.setColor("黑色");
        computer.setWeight(2.5);
        computer.show();

        Computer computer1 = new Computer("品牌2", 3, "红色");
        computer1.show();
    }
}
