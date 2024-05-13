package homework2;

public class Demo1 {
    public static void main(String[] args) {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setName("凤姐");
        girlFriend.setHeight(155.0);
        girlFriend.setWeight(130);
        girlFriend.show();
        girlFriend.wash();
        girlFriend.cook();

        GirlFriend girlFriend1 = new GirlFriend("如花", 175.0, 180.0);
        girlFriend1.show();
        girlFriend1.wash();
        girlFriend1.cook();
    }
}
