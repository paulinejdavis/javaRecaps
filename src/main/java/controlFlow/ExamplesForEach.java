package controlFlow;

public class ExamplesForEach {
    public static void main(String[] args) {
        int[] nrs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for(int n : nrs) {
            System.out.println(n);
            sum += n;
        }
        System.out.println("The sum is: " + sum);
    }
}
