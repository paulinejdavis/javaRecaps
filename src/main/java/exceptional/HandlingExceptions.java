package exceptional;

public class HandlingExceptions {
    public static void main(String[] args) {
        //Call the validateNumber method inside a try/catch bloc
        try {
            ThrowingExceptions.validateNumber(-2);
            //Catch the IllegalArgumentException and print its message.
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
