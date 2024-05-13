package xuan.demo1;

public class Account {
    private String id;
    private String name;
    private String sex;
    private String password;
    private double balance;
    private double limit;

    public Account() {
    }

    public Account(String id, String name, String sex, String password, double balance, double limit) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.balance = balance;
        this.limit = limit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
