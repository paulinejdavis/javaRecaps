package fuctionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walnut", "Brazil Nut", "Something else nut");
        Stream<String> namesStream = names.stream();


        //foreach, performs an action for every element in the stream
        //count: returns the number of elements in the stream
        //min, max: returns the minimum and maximum elements in the stream
        //allmatch: check if all of the elements in the stream match a given predicate
        //anymatch: check if any, of the elements in the stream match a given predicate
        //nonematch: check if none of the elements in the stream match a given predicate
    }
}
