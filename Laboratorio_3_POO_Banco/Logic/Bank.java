package Laboratorio_3_POO_Banco.Logic;

import java.util.ArrayList;
import java.util.List;

public class Bank {
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
        for(AccountSinpe acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
}

