package homework1;

import java.util.ArrayList;

public class HomeWork9 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("ab1");
        stringArrayList.add("123ad");
        stringArrayList.add("bca");
        stringArrayList.add("dadfadf");
        stringArrayList.add("dddaaa");
        stringArrayList.add("你好啊");
        stringArrayList.add("我来啦");
        stringArrayList.add("别跑啊");

        for (int i = 0; i < stringArrayList.size(); i++) {
            String s = stringArrayList.get(i);
            if (s.length() > 5) {
                stringArrayList.remove(i);
                i--;
            }
        }

        System.out.println("stringArrayList = " + stringArrayList);

        for (int i = 0; i < stringArrayList.size(); i++) {
            String s = stringArrayList.get(i);
            char[] chars = s.toCharArray();
            boolean flag = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= '0' && chars[j] <= '9') {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                stringArrayList.remove(i);
                i--;
            }
        }
        System.out.println("stringArrayList = " + stringArrayList);
    }
}
