package Laboratorio_3_POO_Banco.Logic;

import javax.swing.JOptionPane;
import Laboratorio_3_POO_Banco.Presentation.Client;
import Laboratorio_3_POO_Banco.Presentation.Bitacora;
import Laboratorio_3_POO_Banco.Presentation.CheckingAccount;
import Laboratorio_3_POO_Banco.Presentation.SavingsAccount;

public class MainBank_2 {
    public static void main(String[] args) {
        // Create a client
        Client client = new Client("Marco", "Rodriguez", "700600385", 87752456, "Cielo Amarillo, Limon");

        // Display client details in cascada
        String clientInfo = "=== CLIENTE ===\n" +
                            "Nombre: " + client.getName() + "\n" +
                            "Apellido: " + client.getLastname() + "\n" +
                            "ID: " + client.getId() + "\n" +
                            "Teléfono: " + client.getPhone() + "\n" +
                            "Dirección: " + client.getAddress() + "\n";

        JOptionPane.showMessageDialog(null, clientInfo);

        // Create accounts
        CheckingAccount checkingAccount = new CheckingAccount("1-2092-0199-99191", 1000.0, client, 0.02);
        SavingsAccount savingsAccount = new SavingsAccount("3-7673-5262-09287", 5000.0, client, "2025-09-01", 12, 0.05);

        // Display account details in cascada
        String checkingInfo = "=== CHECKING ACCOUNT ===\n" +
                              "Número: " + checkingAccount.getAccountNumber() + "\n" +
                              "Saldo: " + checkingAccount.getBalance() + "\n" +
                              "Cliente: " + checkingAccount.getClient().getName() + " " + checkingAccount.getClient().getLastname() + "\n" +
                              "Interés: " + checkingAccount.getInterest() + "\n";

        String savingsInfo = "=== SAVINGS ACCOUNT ===\n" +
                             "Número: " + savingsAccount.getAccountNumber() + "\n" +
                             "Saldo: " + savingsAccount.getBalance() + "\n" +
                             "Cliente: " + savingsAccount.getClient().getName() + " " + savingsAccount.getClient().getLastname() + "\n" +
                             "Fecha de apertura: " + savingsAccount.getStartDate() + "\n" +
                             "Plazo: " + savingsAccount.getMonthsTerm() + " meses\n" +
                             "Interés: " + savingsAccount.getInterestRate() + "\n";

        JOptionPane.showMessageDialog(null, checkingInfo);
        JOptionPane.showMessageDialog(null, savingsInfo);

        // Perform transactions
        checkingAccount.deposit(500);
        Bitacora log1 = new Bitacora("Deposit", checkingAccount, 500);
        JOptionPane.showMessageDialog(null, "=== After deposit of 500 to Checking Account ===\nSaldo: " + checkingAccount.getBalance());

        checkingAccount.withdraw(200);
        Bitacora log2 = new Bitacora("Withdraw", checkingAccount, 200);
        JOptionPane.showMessageDialog(null, "=== After withdrawal of 200 from Checking Account ===\nSaldo: " + checkingAccount.getBalance());

        savingsAccount.deposit(1000);
        Bitacora log3 = new Bitacora("Deposit", savingsAccount, 1000);
        JOptionPane.showMessageDialog(null, "=== After deposit of 1000 to Savings Account ===\nSaldo: " + savingsAccount.getBalance());

        savingsAccount.withdraw(300);
        Bitacora log4 = new Bitacora("Withdraw", savingsAccount, 300);
        JOptionPane.showMessageDialog(null, "=== After withdrawal of 300 from Savings Account ===\nSaldo: " + savingsAccount.getBalance());

        // Apply interest
        savingsAccount.applyInterest();
        JOptionPane.showMessageDialog(null, "=== After applying interest to Savings Account ===\nSaldo: " + savingsAccount.getBalance());

        // Show logs
        String logs = "=== LOGS ===\n" +
                      "1. " + log1.toString() + "\n" +
                      "2. " + log2.toString() + "\n" +
                      "3. " + log3.toString() + "\n" +
                      "4. " + log4.toString() + "\n";

        JOptionPane.showMessageDialog(null, logs);
    }
}
