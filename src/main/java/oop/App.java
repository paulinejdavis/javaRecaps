package oop;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Cat cat = new Cat();


       // dog = new Cat();

        dog.eat();
        cat.eat();
        ((Dog) dog).bark();

    }

}
