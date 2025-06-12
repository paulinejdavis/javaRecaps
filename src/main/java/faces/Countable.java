package faces;

public interface Countable {

    default void printInfo() {
        System.out.println("Countable Info");
    }
}
