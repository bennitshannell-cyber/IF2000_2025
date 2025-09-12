package Laboratorio_3_POO_Banco.Presentation;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected Client client;

    // Constructor
    public Account(String accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.client = null;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Common methods
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Abstract method for polymorphism
    public abstract void calculateInterest();

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}

