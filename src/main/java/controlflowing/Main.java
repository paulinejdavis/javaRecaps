package controlflowing;



public class Main {

    public static void main(String[] args) {
        int age = 16;
        double ticketPrice;

        if (age  <  5) {
            ticketPrice = 0.00;
        } else if (age < 12 ) {
            ticketPrice = 5.00;
        } else if (age < 18) {
            ticketPrice = 10.00;
        } else {
            ticketPrice = 15.00;
        }

        System.out.println("The price is £" + ticketPrice);
    }

}
