package Laboratorio_3_POO_Banco.Presentation;

public class CheckingAccount extends Account {
    private double interestRate; // Example: 0.02 = 2% yearly

    // Constructor
    public CheckingAccount(String accountNumber, double balance, Client client, double interestRate) {
        super(accountNumber, balance, client);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = (balance * interestRate) / 12;
        balance += interest;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", client=" + client +
                '}';
    }

    public double getInterest() {
        return (balance * interestRate) / 12;
    }
}

