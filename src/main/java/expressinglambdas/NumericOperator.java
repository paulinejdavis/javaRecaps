package expressinglambdas;
//. Annotate the class with the special annotation for functional interfaces.
@FunctionalInterface
public interface NumericOperator {
    //Define a method named operate that takes two int parameters and returns an int.
   int operate( int a, int b);
}
