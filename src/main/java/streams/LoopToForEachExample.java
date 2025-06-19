package streams;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hip", "Hip", "Hooray", "Ray!!");
//        for (String s : strings) {
//            System.out.println(s);
//        }
        strings.forEach(s -> System.out.println(s));
    }
}
