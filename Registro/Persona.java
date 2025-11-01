package Registro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String id;
    private int edad;
    private String correo;
    private String telefono;
    private LocalDateTime fechaRegistro;

    public Persona(String nombre, String id, int edad, String correo, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaRegistro = LocalDateTime.now();
    }

    public String formatoRegistro() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return nombre + "|" + id + "|" + edad + "|" + correo + "|" + telefono + "|" + fechaRegistro.format(formato);
    }
}

