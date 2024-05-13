package xuan.demo1.test3;

public class Teacher {
    private String name;
    private char gender;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Teacher{name = " + name + ", gender = " + gender + ", age = " + age + "}";
    }
}
