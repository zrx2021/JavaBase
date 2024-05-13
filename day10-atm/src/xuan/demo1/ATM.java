package xuan.demo1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private final Scanner sc = new Scanner(System.in);
    private final ArrayList<Account> accountList = new ArrayList<>();

    public void start() {
        while (true) {
            System.out.println("==欢迎进入黑马银行ATM系统==");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("请选择您要操作的命令:");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    userLogin();
                    break;
                case 2:
                    createAccount();
                    break;
                default:
                    System.out.println("没有这样的操作");
            }
        }
    }

    private void userLogin() {
        System.out.println("----------用户登录----------");
        // 如果系统中没有账户
        if (accountList.size() == 0) {
            System.out.println("您好，当前没有账户");
            return;// 结束方法，不执行后面的
        }

        while (true) {
            System.out.println("请输入您的登录卡号：");
            String id = sc.next();
            System.out.println("请输入您的登录密码：");
            String password = sc.next();

            boolean flag = false;
            Account account = null;

            // 遍历账户集合，对比卡号和密码
            for (int i = 0; i < accountList.size(); i++) {
                account = accountList.get(i);
                if (account.getId().equals(id) && account.getPassword().equals(password)) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("恭喜您" + account.getName() + "您已经进入系统，您的卡号是：" + id);
                showOperation(account);
                break;
            } else {
                System.out.println("登录失败，对不起，您的卡号或密码不正确请");
            }
        }
    }

    private void showOperation(Account account) {
    }

    public void createAccount() {
        System.out.println("----------用户开户----------");
        System.out.println("请输入账户用户名：");
        String name = sc.next();
        System.out.println("请输入您的性别：");
        String sex = sc.next();

        String password1 = null;

        while (true) {
            System.out.println("请输入账户密码：");
            password1 = sc.next();
            System.out.println("请再次输入您的账户密码：");
            String password2 = sc.next();

            if (password1.equals(password2)) {
                // 结束输入密码
                break;
            } else {
                System.out.println("两次密码输入不一样！");
            }
        }

        System.out.println("请输入您的每次取现额度：");
        double limit = sc.nextDouble();

        // 随机生成8位数不重复的号码
        String id = createRandomId();

        Account account = new Account(id, name, sex, password1, 0, limit);

        accountList.add(account);

        System.out.println("恭喜您，" + name + " ，开户成功，您的卡号是：" + id);
        System.out.println("系统中的账户数量是：" + accountList.size());
    }

    // 生成8位随机数的不重复卡号
    // 1.生成8位随机数的卡号
    // 2.卡号不重复
    public String createRandomId() {
        // 1.生成8位随机数卡号（第一位不能为0）
        Random r = new Random();
        while (true) {
            // 保存随机数
            String cardId = "";
            // 第一位不能为0 （1到9）-> -1 -> (0到8) + 1
            cardId += r.nextInt(9) + 1;
            // 7位（0到9）的数字
            for (int i = 0; i < 7; i++) {
                cardId += r.nextInt(10);
            }

            // 生成8位随机的卡号，如果卡号重复，重新生成
            // 如果卡号不重复，可以使用，返回这个卡号即可
            Account account = getAccountById(cardId);
            if (account == null) {
                // 卡号没有找到账户，返回null，这个卡号可以使用
                // 返回生成的卡号
                return cardId;
            } else {
                // 卡号找到了账户，卡号存在，重新生成
                System.out.println("卡号找到了账户，卡号存在，重新生成");
            }
        }
    }

    /**
     * 通过卡号id查找账户
     *
     * @param cardId 卡号
     * @return 系统中卡号对应的账户，卡号没有找到账户，返回null
     */
    public Account getAccountById(String cardId) {
        // 遍历ArrayList集合，对比账户的卡号
        for (int i = 0; i < accountList.size(); i++) {
            Account account = accountList.get(i);
            // 账户的卡号等于参数卡号id
            if (account.getId().equals(cardId)) {
                // 通过卡号找到账户，返回账户
                return account;
            }
        }
        // 卡号没有找到账户，返回null
        return null;
    }
}
