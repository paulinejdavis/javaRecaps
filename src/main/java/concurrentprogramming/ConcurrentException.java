package concurrentprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentException {
    public static void main(String[] args) {
        List<String> languages = new CopyOnWriteArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("JavaScript");
        for (String language : languages) {
            languages.add("new");
        }
    }

}