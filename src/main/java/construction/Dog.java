package construction;

public class Dog extends Animal{
    private String breed;

    public Dog(String breed, String species, int age) {
        super(species, age);
        this.breed = breed;
    }
    public Dog() {
        this("Terrier", "Dog", 5);
    }
}
