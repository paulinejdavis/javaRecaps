package structure;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Account {
    private String owner;

    private double balance;
    private double minimumBalance;
    public void deposit(double amount) {
        //imp
    }
    public void withdraw(double amount) {
        //imp
    }

    public double calculateCreditWorthiness() {
        //imp
        return 100;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}