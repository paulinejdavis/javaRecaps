package concurrentprogramming;

public class BankAccount {

    private double balance;

    public synchronized void deposit(double amount) {
        double newBalBalance;
    }

    public synchronized void withdraw(double amount) throws Exception {
        double newBalance = balance - amount;

        if(newBalance < 0) {
            throw new Exception("Insufficient funds");
        }

        balance = newBalance;
    }

    public synchronized double getBalance() {
        return balance;
    }
}
