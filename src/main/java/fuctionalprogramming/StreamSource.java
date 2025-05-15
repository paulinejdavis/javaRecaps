package fuctionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {
        //creating a stream from a collection
        List<String> names = Arrays.asList("Walnut", "Brazil Nut", "Something else nut");
        Stream<String> namesStream = names.stream();


        //creating a stream from an array
        String [] namesArray = {"Walnut", "Brazil Nuts", "Something else nut"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);

        //creating a stream using the Stream.iterate() method
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1);

        // creating a stream using the stream.generate() method
        Stream<Double> randomNumberStream = Stream.generate(Math::random);
    }
}
