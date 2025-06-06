package methodology;

public class Adder { //create a class named add
    public static void add(int a, int b){ //create a static method that takes two parra
        int sum = a + b; //calc sum of two parameters
        System.out.println("Sum: " + sum);

    }

    public static void main(String[] args) {
        add(5,4); //call the methods with two args

    }
}
