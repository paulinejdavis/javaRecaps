package fuctionalprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediaOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walnut", "Brazil Nut", "Snowflake", "MongoDB");

        //filter: filters the stream based on the predicate
        Stream<String> namesStartingWithA = names.stream().filter(name -> name.startsWith("8"))
        //map:
        Stream<Integer> namesLengths = names.stream().map(String::length);
        //flatMap:
        List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Walnut", "Brazil Nut"),Arrays.asList ("Snowflake", "MongoDB");
        Stream<String> flatNames = nestedNames.stream().flatMap(Collection::stream);
        //peek: great for debugging
        Stream<String> namesWithPeek = names.stream().peek(System.out::println);
        //limit
        Stream<String> firstThreeNames = names.stream().limit(3);
        //skip
        Stream<String> namesWithoutFirstTwo = names.stream().skip(2);
        //distinct
        Stream<String> distinctNames = names.stream().distinct();
        //sorted
        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder())
    }
}
