package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Eggs");
        shoppingList.add("Ribena");
        shoppingList.add("Scotch");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);

        System.out.println(shoppingList);
        System.out.println(numbers);


        System.out.println(shoppingList.get(0));
        shoppingList.remove("Ribena");
        System.out.println(shoppingList);
        boolean containsScotch = shoppingList.contains("Scotch");

        System.out.println(containsScotch);
    }
}
