package xuan.homework1;

public class Demo1 {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = new GirlFriend();
        girlFriend1.setName("凤姐");
        girlFriend1.setHeight(155.0);
        girlFriend1.setWeight(130.0);

        System.out.println("我女朋友叫" + girlFriend1.getName() + "身高" + girlFriend1.getHeight() + "体重" + girlFriend1.getWeight() + "斤");

        GirlFriend girlFriend2 = new GirlFriend();
        girlFriend2.setName("迪妮热巴");
        girlFriend2.setHeight(175.0);
        girlFriend2.setWeight(90.0);
        System.out.println("我女朋友叫" + girlFriend2.getName() + "身高" + girlFriend2.getHeight() + "体重" + girlFriend2.getWeight() + "斤");
    }
}
