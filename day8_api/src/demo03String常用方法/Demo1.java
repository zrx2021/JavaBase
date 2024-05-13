package demo03String常用方法;

public class Demo1 {
    public static void main(String[] args) {
        // 创建字符串对象
        String s1 = "广州黑马Java";

        // 2.调用方法 对象名.方法名(参数)
        // 2.1.length()：获取字符串长度
        System.out.println("长度：" + s1.length());

        // 2.2.charAt(int index)：根据索引获取对应位置的字符
        System.out.println(s1.charAt(0));// 广
        System.out.println(s1.charAt(1));// 州

        // 2.3.toCharArray()：提取字符串中所有字符（把字符串转成字符数组）
        char[] chars = s1.toCharArray();

        // 遍历数组拿到每个字符
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
