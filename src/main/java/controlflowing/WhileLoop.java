package controlflowing;

public class WhileLoop {

    public static void main(String[] args) {
        int n = 2;
        int counter = 0;
        int i = 0;

        while (counter < n) {
            if (i % 2 == 0) {
                System.out.println(i);
                counter++;

            }
            i++;
        }
    }
}
