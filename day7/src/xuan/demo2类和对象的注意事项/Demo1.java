package xuan.demo2类和对象的注意事项;

public class Demo1 {
    public static void main(String[] args) {
        Goods goods = new Goods();
        goods.store = "商家信息";
        goods.price = 100.0;
        goods.count = 100;
        goods.image = "图片地址";
        goods.description = "商品描述";

        goods.print();

        System.out.println("-------------");

        Goods goods2 = new Goods();
        goods2.store = "商家信息123";
        goods2.price = 120.0;
        goods2.count = 120;
        goods2.image = "图片地址123";
        goods2.description = "商品描述123";

        goods2.print();
    }
}
