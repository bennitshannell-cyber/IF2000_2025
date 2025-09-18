package Laboratorio_3_POO_Banco.Logic;

public class AccountSinpe {
    private String accountNumber;
    private String ClientID;
    private double amount;

    public AccountSinpe(String accountNumber, String ClientID, double amount) {
        this.accountNumber = accountNumber;
        this.ClientID = ClientID;
        this.amount = amount;
    }
    public String getAccountNumber() {
        return accountNumber;
    }   
    public String getClientID() {
        return ClientID;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double amount) {
        this.amount += amount;
    }
    public boolean withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
            return true;
        } else {
            return false; // Fondos insuficientes
        }
    }

    @Override
    public String toString() {
        return "AccountSinpe{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ClientID='" + ClientID + '\'' +
                ", amount=" + amount +
                '}';
    }

}
