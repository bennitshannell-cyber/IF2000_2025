package Registro;

import java.util.Scanner;

public class Email {
     public static String leerEmailValido(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (!email.contains("@")) {
                System.out.println("Error: el correo debe contener '@'.");
            }
        } while (!email.contains("@"));
        return email;
    }
}
