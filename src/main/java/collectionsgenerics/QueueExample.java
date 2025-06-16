package collectionsgenerics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Character> blah = new LinkedList<>();
        blah.add('a');
        blah.add('d');
        blah.add('f');
        System.out.println(blah);
    }
}
