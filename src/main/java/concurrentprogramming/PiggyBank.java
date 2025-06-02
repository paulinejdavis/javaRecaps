package concurrentprogramming;



public class PiggyBank {

    private int balance = 10;

    public void orderPizza(String threadName) {
        if (balance >= 10) {
            System.out.println(threadName + " is ordering a pizza.");
            balance -= 10;
        } else {
            System.out.println(threadName + " cannot order, not enough funds.");
        }
    }

    public int getBalance() {
        return balance;
    }

    class Main {
        public static void main(String[] args) {
            PiggyBank sharedPiggyBank = new PiggyBank();

            Thread roommate1 = new Thread(() -> sharedPiggyBank.orderPizza("Roommate1"));
            Thread roommate2 = new Thread(() -> sharedPiggyBank.orderPizza("Roommate1"));

            roommate1.start();
            roommate2.start();
        }

    }
}
