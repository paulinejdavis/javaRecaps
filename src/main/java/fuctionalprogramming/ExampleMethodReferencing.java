package fuctionalprogramming;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferencing {
    public static void main(String[] args) {
        Function<Integer, String> nrToHexString = i -> Integer.toHexString(i);
        Function<Integer, String> nrToHexStringMethodReference = Integer::toHexString;
        System.out.println(nrToHexStringMethodReference.apply(256));

        String prefix = "Hello ";
        Function<String, String> greet = s -> prefix + s;
        Function<String, String> greetMethodReference = prefix::concat;
        System.out.println(greetMethodReference.apply("you"));

        //reference to an instance method of an arbitary object

        BiFunction<String, String, Integer> stringComparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        BiFunction<String, String, Integer> stringCComparatorMethodReference = String::compareToIgnoreCase;
        System.out.println(stringCComparatorMethodReference.apply("HI", "Hi"));

    //ref to a constructor
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = listSupplier.get();
        names.add("Elvis");
        System.out.println(names.get(0));
    }
}

