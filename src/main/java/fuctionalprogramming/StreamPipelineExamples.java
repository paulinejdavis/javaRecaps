package fuctionalprogramming;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//use stream api to process data effectively - nice way of dealing with data
public class StreamPipelineExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walnut", "Mandarin", "Ladybug", "Abba", "Bobbie");
        List<String> namesStartingWithB = names.stream()
                .filter(name -> name.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(namesStartingWithB);

        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestName);

        Set<Integer> uniqueIntegers = names.stream()
                .map(String::length)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(uniqueIntegers);

        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

    }

}
