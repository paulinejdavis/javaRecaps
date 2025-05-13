package interfaces;

public class Fox extends Mammal implements Predator, Prey {
    @Override
    public void catchAndEat() {
        System.out.println("Fox is catching and eating prey");
    }

    @Override
    public void runAndHide() {
        System.out.println("Running and hiding from a predator.");

    }
    @Override
    public void run() {
        System.out.println("Fox is running.");
    }
}
