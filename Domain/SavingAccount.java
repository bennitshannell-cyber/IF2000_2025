package Domain;

public class SavingAccount extends Cuenta{

    private String initialDate;
    private int months;
    private float interest;

    // Constructor
    public SavingAccount(String accountNumber, double balance, Persona client, String initialDate, int months, float interest) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }
    // consructor vacio
    public SavingAccount() {
        super();
        this.initialDate = "";
        this.months = 0;
        this.interest = 0.0f;
    }

    // Getters and Setters
    public String getInitialDate() {
        return initialDate;
    }           

    public int getMonths() {
        return months;
    }

    public float getInterest() {
        return interest;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(this.getBalance() + amount);
        // Implementation for deposit in SavingAccount
    }

    @Override
    public void withdraw(double amount) {
        // Implementation for withdraw in SavingAccount
        super.withdraw(this.getBalance() - amount);
        if (this.getBalance() < amount) {
            System.out.print("You dont have enough money" + amount);
        }
    }

    @Override
    public double interestCalculation() {
        // Implementation for interest calculation in SavingAccount
        double total;
        total = this.getMonths() * super.getBalance() * this.getInterest();
        return super.getBalance() + total;
    }

    @Override
    public String toString() {
        String result = "/nSAVINGS ACCOUNT INFORMATION/n" +

                "Initial Date: " + this.getInitialDate() 
                + "/n" + "Months: " + this.getMonths() 
                + "/n" +"Interest: " + this.getInterest() 
                + "/n" +"Gained Interest: " + ((this.getMonths() 
                                            * super.getBalance()/100) 
                                            * this.getInterest())
                + "/n" + "Balance after interest: " + this.getBalance()
                                                    + ((this.getMonths() 
                                                    * super.getBalance()/100) 
                                                    * this.getInterest());
        return super.toString() + result;
    }
    @Override
    public void deposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
    @Override
    public void withdraw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }
}
