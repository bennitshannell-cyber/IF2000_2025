package Logic;

import java.util.Scanner;

public class Ejercicios_Semana2_PracticaEnClase {

    public void quiz2_A_primos() {
        // Código del ejercicio A
    }

    public void quiz2_B_piramide(int n) {
        for (int i = 1; i <= n; i++) {
            // Controla los espacios vacios
            for (int j = 1; j <= n - i; j++) {
                //Controla los *s de la piramide
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void ejercicio_A(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void ejercicio_B(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void ejercicio_C(int n) {
        for (int i = n; i >= 1; i--) {             
            for (int e = 0; e < (n - i) * 2; e++) { 
            System.out.print(" ");
            }
                for (int j = 1; j <= i; j++) {          
            System.out.print("*");
        }
        System.out.println();                   
     }
  } 
  public void ejercicio_D(Scanner sc) {
    int[] numeros = new int[10];
    System.out.println("Ingrese 10 números enteros:");
    for (int i = 0; i < 10; i++) {
        numeros[i] = sc.nextInt();
    }
    // Ordenar el arreglo en orden ascendente
    for (int i = 0; i < numeros.length - 1; i++) {
        for (int j = 0; j < numeros.length - 1 - i; j++) {
            if (numeros[j] > numeros[j + 1]) {
                // Intercambiar
                int temp = numeros[j];
                numeros[j] = numeros[j + 1];
                numeros[j + 1] = temp;
            }
        }
    }
    System.out.println("Números ordenados en orden ascendente:");
    for (int num : numeros) {
        System.out.print(num + " ");
    }
    System.out.println();
  }
    public void ejercicioE() {
        int[] numeros = new int[100];
        // Generar 100 números aleatorios entre 1 y 1000
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 1000) + 1;
        }
        // Ordenar el arreglo en orden descendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    // Intercambiar
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("100 números aleatorios ordenados en orden descendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public void ejercicioF() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("B "); 
                } else {
                    System.out.print("N "); 
                    // fichas negras
                }
            }
            System.out.println();
        }
    }
}
