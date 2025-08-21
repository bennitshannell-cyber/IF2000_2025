package Logic;

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
                // Si estamos en los bordes del cuadrado
                System.out.print("*");
            } else {
                // Si estamos dentro del cuadrado
                System.out.print(" ");
            }
        }
        System.out.println();                
    }
}
}
