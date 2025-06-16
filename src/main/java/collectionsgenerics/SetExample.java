package collectionsgenerics;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> allNums = new HashSet<>();
        allNums.add(5);
        allNums.add(66);
        allNums.add(777);
        System.out.println(allNums);
        //hashset is unordered need to convert to a list to get the index access
        //set is for uniqueness and fast lookup

    }
}
