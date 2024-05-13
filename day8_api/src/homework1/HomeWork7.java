package homework1;

public class HomeWork7 {
    public static void main(String[] args) {
        String books = "《Head First Java》、《Effective Java》、《Python核心编程》、《Java并发实践》、《Thinking in Java》、《Python编程快速上手》";
        String[] split = books.split("、");
        for (int i = 0; i < split.length; i++) {
            if (split[i].contains("Java")) {
                System.out.println(split[i]);
            }
        }
    }
}
