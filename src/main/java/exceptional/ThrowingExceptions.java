package exceptional;

public class ThrowingExceptions {

    //create a method validateNumber that takes an int parameter.
    public static void validateNumber(int num) {

        if (num < 0 );
        throw new IllegalArgumentException("Are you using a negative number?");
    }
}
