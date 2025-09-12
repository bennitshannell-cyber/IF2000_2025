package Laboratorio_3_POO_Banco.Logic;

import java.util.ArrayList;
import java.util.List;

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

class Bank{
    private String name;
    private List<AccountSinpe> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(AccountSinpe account) {
        accounts.add(account);
    }

    public AccountSinpe getAccount(String accountNumber) {
        for (AccountSinpe account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public AccountSinpe researchAccount(String accountNumber) {
        AccountSinpe account = getAccount(accountNumber);
        for(AccountSinpe acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}

class SinpeSystem {
    private List<Bank> banks;

    public SinpeSystem() {
        this.banks = new ArrayList<>();
    }

    public void registerBank(Bank bank) {
        banks.add(bank);
    }
    // Transferencia entre bancos
    public void transferir(String accountOrigen, String accountDestino, double monto) {
        AccountSinpe origen = null, destino = null;
        Bank bankOrigen= null, bankDestino = null;

    // Buscar las cuentas y bancos correspondientes
        for (Bank banco : banks) {
            AccountSinpe cuenta = banco.getAccount(accountOrigen);
            if (cuenta != null) {
                origen = cuenta;
            }
            cuenta = banco.getAccount(accountDestino);
            if (cuenta != null) {
                destino = cuenta;
                bankDestino = banco;
            }
        }

        if (origen == null) {
            System.out.println("Cuenta de origen no encontrada: " + accountOrigen);
            return;
        }
        if (destino == null) {
            System.out.println("Cuenta de destino no encontrada: " + accountDestino);
            return;
        }
        if (origen.withdraw(monto)) {
            destino.deposit(monto);
            System.out.println("Transferencia exitosa de " + monto + " de " + accountOrigen + " a " + accountDestino);
        } else {
            System.out.println("Fondos insuficientes en la cuenta de origen: " + accountOrigen);
        }
    }
            
}
