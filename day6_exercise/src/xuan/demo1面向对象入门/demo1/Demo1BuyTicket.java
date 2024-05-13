package xuan.demo1面向对象入门.demo1;

/*
用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，优惠方案如下：5-10月为旺季，头等舱9折，经济舱8.5折；
11月到来年4月为淡季，头等舱7折，经济舱6.5折，请开发程序计算出用户当前机票的优惠价。
 */
public class Demo1BuyTicket {
    public static void main(String[] args) {
        System.out.println(calcPrice(13, "经济舱", 1000));
        System.out.println(calcPrice(8, "头等舱", 1000));
        System.out.println(calcPrice(3, "经济舱", 1000));
    }

    public static double calcPrice(int mouth, String type, double price) {
        if (mouth <= 0 || mouth >= 13) {
            System.out.println("月份不合法");
            return price;
        }

        if (mouth >= 5 && mouth <= 10) {
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "头等舱":
                    price *= 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
