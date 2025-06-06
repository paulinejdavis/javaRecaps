package controlflowing;

public class EachFor {

    public static void main(String[] args) {
        int[] numbers = {1, 8, 5, 4, 9};
        int calculate = 0;

        for ( int num : numbers) {
            calculate += num;
        }
        System.out.println("The sum of the loop: " + calculate);
    }
}
