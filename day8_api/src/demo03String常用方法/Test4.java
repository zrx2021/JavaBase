package demo03String常用方法;

/*
目标：了解String的常用方法
    1.字符串的替换: public String replace(CharSequence target, CharSequence replacement)
    2.判断字符串中是否包含某个内容: public boolean contains(CharSequence s)
    3.判断字符串是否以某个内容开头: public boolean startsWith(String prefix)
    4.字符串分割: public String[] split(String regex)
 */
public class Test4 {
    public static void main(String[] args) {
        // String 字符串时不可变的，对字符串操作不会改变这个原始的字符串，饭后操作后的新字符串
        // 1. 字符串的替换：public String replace(CharSequence target, CharSequence replacement)
        String s1 = "这个手机太垃圾了，开机五分钟，充电两小时，真的是垃圾啊！";
        String replaceStr = s1.replace("垃圾", "**");// 这个手机太**了，开机五分钟，充电两小时，真的是**呀！
        System.out.println("原始字符串 = " + s1);
        System.out.println("替换后字符串 = " + replaceStr);

        // 2. 判断字符串中是否包含某给内容：public boolean contains(CharSequence s)
        String s2 = "我超喜欢Java,Java有前途,Java有钱图";
        System.out.println(s2.contains("Java"));// true
        System.out.println(s2.contains("java"));// false

        // 3. 判断字符串是否以某个内容开头：public boolean starsWith(String prefix)
        String s3 = "张三丰";
        System.out.println(s3.startsWith("张"));// true
        System.out.println(s3.startsWith("丰"));// false

        String s4 = "138389438";
        System.out.println(s4.startsWith("138"));// true
        System.out.println(s4.startsWith("139"));// false

        // 4.字符串分割：public String[] split(String regex)
        String s5 = "张三,李四,王五,赵六";// "张三,李四,王五,赵六" -> split(",") -> "张三" "李四" "王五" "赵六" -> new String[] {"张三", "李四", "王五", "赵六"}
        System.out.println("s5 = " + s5);
        String[] split = s5.split(",");
        // 遍历数组获取每个字符串
        for (int i = 0; i < split.length; i++) {
            String name = split[i];
            System.out.println(name);
        }
    }
}
