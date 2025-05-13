package genericsandcollections;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<String, Integer> namesAgesMap  = new HashMap<>();
        namesAgesMap.put("Polly", 21);
        namesAgesMap.put("Milly", 31);
        namesAgesMap.put("Tilly", 41);

        System.out.println(namesAgesMap);
        System.out.println(namesAgesMap.get("Milly"));

        for(Integer i : namesAgesMap.values()) {
            System.out.println(i);
        }

        for(String s : namesAgesMap.keySet()) {
            System.out.println(s + ": " + namesAgesMap.get(s));
        }

        for(Map.Entry<String, Integer> entry : namesAgesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        namesAgesMap.remove("Milly");
        namesAgesMap.put("Polly", 22);

        System.out.println(namesAgesMap);

    }
}
