package xuan.demo7JavaBean实体类;

/*
JavaBean4个步骤
1. 成员变量私有
2. 提供get/set方法
3. 一定要有无参构造器
4. 建议要满参构造器
 */
public class Student {

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private String name;
    private double score;
}
