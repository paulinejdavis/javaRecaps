package projects;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Please enter your location");
        String location = scanner.nextLine();
        System.out.println("You're located in: " + location);

        scanner.close();
    }
}
