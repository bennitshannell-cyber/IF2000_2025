package Registro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArchivo {
    private static final String NOMBRE_ARCHIVO = "personas.txt";

    public static void guardarLinea(String linea) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            writer.write(linea);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
