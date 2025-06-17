package exceptional;

public class CheckedVsUnchecked {

    public static void validateString(String word) throws EmptyStringException{
        if (word.isEmpty()) {
            throw new EmptyStringException("Please type something..");
        }
    }
}
