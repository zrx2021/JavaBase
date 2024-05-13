package homework1;

public class Computer {
    private String brand;
    private double weight;
    private String color;

    public Computer() {
    }

    public Computer(String brand, double weight, String color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println("品牌：" + brand + " 重量：" + weight + " 颜色：" + color);
    }
}
