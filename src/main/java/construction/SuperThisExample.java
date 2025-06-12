package construction;

public class SuperThisExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("lab", "dog", 3);
        Dog dog2 = new Dog();
        System.out.println("Dog objects: " + dog1 + dog2);
    }
}

/*9. Add another constructor in Dog that doesn’t take any arguments. Call the constructor with three parameters with the this() call. Provide default values for the dog’s species, age and breed.

10. Create a class named SuperThisExample with a main method.

11. In the main method, create an instance of the Dog class using the custom constructor and the default constructor.*/