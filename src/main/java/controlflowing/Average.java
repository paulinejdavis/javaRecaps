package controlflowing;

public class Average {

    public static void main(String[] args) {
        //declare an int, sum and count
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int count = 0;
        int sum = 0;

//use a for loop and if statement to check if odd or not
        for (int number : numbers) {
            if (number % 2 !=0) {
                sum += number; //check
                count++;
            }

        }
        double average = (double) sum / count; //calc the odd numbers
        System.out.println("Average of: " + average);
    }
}
