package getoverit;

public class Bird extends Animal {
    public Bird() {
        super("Chirp");
    }
    //        Override the makeSound method in the Bird class to print "Bird sound: " followed by the sound value using the getter.
    @Override
    public void makeSound() {
        System.out.println("Bird sound: " + getSound());
    }
}
