package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquaresExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        //stream API to square each number in the list and then calculate the sum using the reduce method.
        int sumOfSquares =  numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of square: " + sumOfSquares );
    }
}
