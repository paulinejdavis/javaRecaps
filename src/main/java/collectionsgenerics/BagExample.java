package collectionsgenerics;

public class BagExample {
    // One Bag should take String content and the other Bag should take Integer content.
    public static void main(String[] args) {
        Bag<String> newBag = new Bag<>();
        newBag.addItem("jacket");
        newBag.addItem("shirt");
        newBag.removeItem("jacket");

        Bag<Integer> integerBag = new Bag<>();
        integerBag.addItem(1);
        integerBag.addItem(2);
        integerBag.removeItem(1);
        System.out.println(newBag);


    }
}
