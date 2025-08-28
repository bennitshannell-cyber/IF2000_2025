package Logic;

import java.util.Scanner;

import Domain.Persona;


public class Main {
    public static void main(String[] args) {
        Ejercicios_Semana2_PracticaEnClase eje = new Ejercicios_Semana2_PracticaEnClase();
        //Quiz 2//
        eje.quiz2_A_primos();
        eje.quiz2_B_piramide(5);

        //ejercicio A//
        eje.ejercicio_A(8);

        //Capicua//
        Scanner sc = new Scanner(System.in);
        Ejercicios ejer = new Ejercicios();
        System.out.print("Ingrese un número para verificar si es capicúa: ");
        int numero = sc.nextInt();
        boolean esCapicua = ejer.capicua(numero);
        System.out.println("¿El número " + numero + " es capicúa? " + esCapicua);
        sc.close();
        
        //Suma de números//
        System.out.print("La suma de los dígitos: ");
         ejer.sumNum(sc.nextInt());
        
         //Dueño de la cuenta//
        Persona p = new Persona("Yudhansen", "Paniagua", "3-0808-5656", "12123434", 20);
        System.out.println(p.toString());

        //Ejercicio_B
        System.out.println("B) Triángulo decreciente\n");
        eje.ejercicio_B(5); 

        //Ejercicio_C
        System.out.println("C) Triángulo desplazado a la derecha\n");
        eje.ejercicio_C(5);

        //Ejercicio_D
        System.out.println("D) Ordenar 10 enteros\n");
        eje.ejercicio_D(sc);

        // Ejercicio_E
        System.out.println("E) 100 enteros aleatorios ordenados descendentemente\n");
        eje.ejercicioE();

        // Ejercicio_F
        System.out.println("F) Tablero de Damas\n");
        eje.ejercicioF();
        sc.close();

    }
}


