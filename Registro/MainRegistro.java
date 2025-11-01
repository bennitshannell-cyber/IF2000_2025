package Registro;

import java.util.Scanner;

public class MainRegistro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PERSONA ===");

        String nombre = ValidadorEntrada.leerNoVacio(sc, "Ingrese su nombre completo: ");
        String id = ValidadorEntrada.leerNoVacio(sc, "Ingrese su identificación: ");
        int edad = ValidadorEntrada.leerEnteroPositivo(sc, "Ingrese su edad: ");
        String correo = Email.leerEmailValido(sc, "Ingrese su correo electrónico: ");
        String telefono = Telefono.leerTelefonoValido(sc, "Ingrese su número de teléfono: ");

        Persona persona = new Persona(nombre, id, edad, correo, telefono);

        GestorArchivo.guardarLinea(persona.formatoRegistro());

        System.out.println("Registro guardado en personas.txt");

        sc.close();
    }
}
