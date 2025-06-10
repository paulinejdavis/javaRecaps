package stringobjectives;

public class StringMethods {
    public static void main(String[] args) {
        String value = "Hello, World!";

        System.out.println(value.length());
        System.out.println(value.toUpperCase());
        System.out.println(value.toLowerCase());
        System.out.println(value.substring(7, 12));
        System.out.println(value.replace("World!", "Java"));
    }
}
