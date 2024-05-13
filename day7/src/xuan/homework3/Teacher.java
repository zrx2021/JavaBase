package xuan.homework3;

public class Teacher {
    String name;
    String number;

    public Teacher() {
    }

    public Teacher(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void teach() {
        System.out.println("工号为" + number + "的" + name + "老师正在讲课");
    }
}
