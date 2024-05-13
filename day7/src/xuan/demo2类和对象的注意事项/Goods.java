package xuan.demo2类和对象的注意事项;

public class Goods {
    String image;
    double price;
    String description;
    int count;
    String store;

    public void print() {
        System.out.println("商品图片：" + image);
        System.out.println("商品价格：" + price);
        System.out.println("商品描述：" + description);
        System.out.println("商品数量：" + count);
        System.out.println("商家信息：" + store);
    }
}
