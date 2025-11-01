package Registro;

import java.util.Scanner;

public class Telefono {
    public static String leerTelefonoValido(Scanner sc, String prompt) {
        String telefono;
        do {
            System.out.print(prompt);
            telefono = sc.nextLine().trim();
            if (!telefono.matches("\\d{8,}")) {
                System.out.println("Error: el teléfono debe tener solo dígitos y al menos 8 caracteres.");
            }
        } while (!telefono.matches("\\d{8,}"));
        return telefono;
    }
}
