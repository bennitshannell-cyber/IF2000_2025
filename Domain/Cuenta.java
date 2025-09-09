package Domain;

    public abstract class Cuenta {
    // Attributes
    private String accountNumber;
    private double balance;
    private Persona client;

    // Constructor
    public Cuenta(String accountNumber, double balance, Persona client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public Cuenta() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.client = new Persona();
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

    public Persona getClient() {
        return client;
    }

    public void setClient(Persona client) {
        this.client = client;
    }
    //Methods for polymorphism
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
      
    }

    public abstract void deposit ();
    public abstract void withdraw ();
    public abstract double interestCalculation();


    @Override
    public String toString() {
        String result = "/nBANK ACCOUNT INFORMATION/:" 
                + "/n" 
                + "/n" + "Account Number: " + this.getAccountNumber() 
                + "/n" + "Balance: " + this.getBalance() 
                + "/n" + "Account Owner: " + this.getClient().toString() 
                + "/n";
        return result;
    }
}

