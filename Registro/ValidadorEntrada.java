package Registro;

import java.util.Scanner;

public class ValidadorEntrada {
    public static String leerNoVacio(Scanner sc, String prompt) {
        String valor;
        do {
            System.out.print(prompt);
            valor = sc.nextLine().trim();
            if (valor.isEmpty()) {
                System.out.println("Error: el campo no puede estar vacío.");
            }
        } while (valor.isEmpty());
        return valor;
    }
    public static int leerEnteroPositivo(Scanner sc, String prompt) {
        int valor = -1;
        do {
            System.out.print(prompt);
            try {
                valor = Integer.parseInt(sc.nextLine().trim());
                if (valor <= 0) {
                    System.out.println("Error: el número debe ser positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: entrada inválida. Por favor ingrese un número entero.");
            }
        } while (valor <= 0);
        return valor;
    }
}