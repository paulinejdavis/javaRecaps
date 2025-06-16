package collectionsgenerics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Jane", 21);
        nameAge.put("Tom", 23);
        nameAge.put("Jerry", 29);
        System.out.println(nameAge);
    }
}
