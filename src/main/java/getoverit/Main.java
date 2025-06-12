package getoverit;

public class Main {
    //        Create a class named Main with a main method.

    public static void main(String[] args) {
        //        In the main method, create objects of type Animal, Bird, and Parrot.
        Animal animal = new Animal("Roar!!!");
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        //invoke methods
        animal.makeSound();
        bird.makeSound();
        parrot.makeSound();

    }
}
