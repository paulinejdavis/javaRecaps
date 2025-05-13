package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = (x, y) -> x + y;
        System.out.println(c1.calculate(3, 5));
    }
}
