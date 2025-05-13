package genericsandcollections;

import java.util.zip.CheckedInputStream;

public class Main {
    public static void main(String[] args) {
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        Chihuahua chihuahua = new Chihuahua();
        chihuahua.setName("Ricardo");

        chihuahuaBag.setContent(chihuahua);

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("My main bag");

        laptopBag.setContent(laptop);

    }
}
