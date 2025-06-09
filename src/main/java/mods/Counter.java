package mods;

public class Counter {

    //create a static field count
    public static int count = 0;
    //create a static method increment
    public static void increment () {
        count ++;
    }

    public static void main(String[] args) {
        Counter.increment();
        System.out.println("count: " + count);
    }
}
