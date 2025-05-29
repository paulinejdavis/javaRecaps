package concurrentprogramming;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentCollectionsJava {
    public static void main(String[] args) {
        ConcurrentMap<String, String> languageMap = new ConcurrentHashMap<>();
        languageMap.put("Bob","Java");
        languageMap.put("Adam","Python");

        for(String key : languageMap.keySet()) {
                System.out.println(key + " prefers " + languageMap.get(key));
        }

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        try {
                queue.put("Message One");
                String message = queue.take();
                System.out.println("Message taken: " + message);
        } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
        }

        ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();
        map.put("C", "cat");
        map.put("A", "apple");
        map.put("B", "bat");
        map.descendingMap().forEach((key, value) -> System.out.println(key + " -> " + value));

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("One");
        list.add("Two");
        for (String s : list) {
            System.out.println(s);
        }

    }

}