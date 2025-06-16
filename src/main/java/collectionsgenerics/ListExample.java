package collectionsgenerics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> stuff = new ArrayList<>();
        stuff.add("stuff");
        stuff.add("more stuff" );
        stuff.add("even more stuff");
        System.out.println(stuff);
        System.out.println(stuff.get(1));
    }
}
