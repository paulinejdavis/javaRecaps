package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Wonderful", "Glorius", "Exciting", "Splendid");
        List<String> uppercaseStringsNow = strings.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println("Upper case now: " + uppercaseStringsNow);
    }
}
