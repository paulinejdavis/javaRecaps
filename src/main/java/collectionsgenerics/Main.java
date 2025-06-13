package collectionsgenerics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(2);
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Happy");
    }
}
