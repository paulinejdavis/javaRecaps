package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(66,22,55,44,33);
        List<Integer> even =  nums.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared odd nums: " + even );
    }
}
