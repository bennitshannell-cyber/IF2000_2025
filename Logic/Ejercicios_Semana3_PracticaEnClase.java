package Logic;

public class Ejercicios_Semana3_PracticaEnClase {

    public void Quiz3(int n) {
        for (int i = 0; i < n; i++) {   
             // filas del cuadro
            for (int j = 0; j < n; j++) {     
             // columnas del cuadro
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                     // Bordes del cuadro
                    System.out.print("* ");
                }
                // * en el centro 
                else if (i == n / 2 && j == n / 2) {
                    System.out.print("* ");
                }
                // Espacios internos
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
