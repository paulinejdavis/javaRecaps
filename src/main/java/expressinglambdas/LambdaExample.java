package expressinglambdas;

public class LambdaExample {
    public static void main(String[] args){
        NumericOperator subtraction = (a, b) -> a - b;
        int sum = subtraction.operate(16,10);
        System.out.println("Sum : " + sum);

        //lambda expression to find the maximum of two integers.
        NumericOperator maximum = (a, b) -> (a > b) ? a : b;
        int max = maximum.operate(19, 9);
        System.out.println("Maxmimum: " + max);

        StringFormatter toUpperCase = (input -> input.toUpperCase());
        String UppercaseString = toUpperCase.format("hello");
        System.out.println("Upper case String: " + UppercaseString);

    }
}
