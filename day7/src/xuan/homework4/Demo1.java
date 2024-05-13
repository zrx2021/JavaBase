package xuan.homework4;

public class Demo1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setBrand("小米");
        phone1.setColor("黑色");
        phone1.setPrice(3998);
        phone1.call();

        Phone phone2 = new Phone("小米", 3998, "黑色");
        phone2.sendMessage();
    }
}
