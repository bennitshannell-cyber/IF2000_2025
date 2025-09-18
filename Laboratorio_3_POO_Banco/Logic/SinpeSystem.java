package Laboratorio_3_POO_Banco.Logic;

import java.util.ArrayList;
import java.util.List;

public class SinpeSystem {
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
        // Buscar las cuentas y bancos correspondientes
        for (Bank banco : banks) {
            AccountSinpe cuenta = banco.getAccount(accountOrigen);
            if (cuenta != null) {
                origen = cuenta;
            }
            cuenta = banco.getAccount(accountDestino);
            if (cuenta != null) {
                destino = cuenta;
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
