package xuan.demo6封装;

public class Student {
    private String name;
    private double score;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("非法数据：" + score);
        }
    }

    public double getScore() {
        return score;
    }
}
