package collectionsgenerics;

//Import java.util.List and java.util.ArrayList.

import java.util.ArrayList;
import java.util.List;

// Create a class named Bag with a type parameter T.
public class Bag<T> {
    // Add a private member content of type List<T>.
    private List<T> content;

    //Initialize content with an empty ArrayList of type T.
    public Bag() {
        content = new ArrayList<>();
    }

    //Create a method addItem to add items to the content.
    public void addItem(T item) {
        content.add(item);
    }

    //  Create a method removeItem to remove items from the content.
    public void removeItem(T item) {
        content.remove(item);

    }

    // Create a method getItems to return the content.
    public List<T> getItems() {
        return content;
    }

}

// Create a class BagExample, in there create two bags and add some content.



