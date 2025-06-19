package streams;

import expressinglambdas.NumericOperator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8,7,6,5,4,3,2,1);
        Optional<Integer> max = numbers.stream()
                .max(Integer::compare);
        max.ifPresent(value -> System.out.println("Maximum value: " + value));

    }
}
