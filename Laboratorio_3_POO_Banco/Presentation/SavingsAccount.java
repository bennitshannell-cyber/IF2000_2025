package Laboratorio_3_POO_Banco.Presentation;

public class SavingsAccount extends Account {
    private String startDate;   // example: "2025-09-01"
    private int monthsTerm;     // number of months in fixed term
    private double interestRate; // Example: 0.05 = 5% yearly

    // Constructor
    public SavingsAccount(String accountNumber, double balance, Client client,
                          String startDate, int monthsTerm, double interestRate) {
        super(accountNumber, balance, client);
        this.startDate = startDate;
        this.monthsTerm = monthsTerm;
        this.interestRate = interestRate;
    }

    // Implement interest calculation
    @Override
    public void calculateInterest() {
        double interest = monthsTerm * balance * interestRate;
        balance += interest;
    }

    // Getters and setters
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonthsTerm() {
        return monthsTerm;
    }

    public void setMonthsTerm(int monthsTerm) {
        this.monthsTerm = monthsTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", startDate='" + startDate + '\'' +
                ", monthsTerm=" + monthsTerm +
                ", interestRate=" + interestRate +
                ", client=" + client +
                '}';
    }

    public void applyInterest() {
        double interest = (balance * interestRate * monthsTerm) / 12;
        balance += interest;
    }
}

