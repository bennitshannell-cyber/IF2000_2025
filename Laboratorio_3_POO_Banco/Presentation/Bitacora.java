package Laboratorio_3_POO_Banco.Presentation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bitacora {

    private static int entryCount = 0;
    private int idEvent;
    private String eventType;
    private String timestamp;
    private Account account;  // Reference to the associated account
    private double amount;

    // Constructor
    public Bitacora(String eventType, Account account, double amount) {
        this.idEvent = ++entryCount;
        this.eventType = eventType;
        this.account = account;
        this.amount = amount;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.timestamp = LocalDateTime.now().format(formatter);
    }

    @Override
    public String toString() {
        return "Bitacora{" +
                "idEvent=" + idEvent +
                ", eventType='" + eventType + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", account=" + account.getAccountNumber() +  // Display account number
                ", amount=" + amount +
                '}';
    }
}
